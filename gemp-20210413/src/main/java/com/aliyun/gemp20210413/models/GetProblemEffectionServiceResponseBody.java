// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetProblemEffectionServiceResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>e2d4306a-bf4d-4345-9ae6-158223c85dbd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProblemEffectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceResponseBody self = new GetProblemEffectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceResponseBody setData(GetProblemEffectionServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProblemEffectionServiceResponseBodyData getData() {
        return this.data;
    }

    public GetProblemEffectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProblemEffectionServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ew</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>6442430</p>
         */
        @NameInMap("effectionServiceId")
        public Long effectionServiceId;

        /**
         * <strong>example:</strong>
         * <p>P2</p>
         */
        @NameInMap("level")
        public Long level;

        @NameInMap("picUrl")
        public java.util.List<String> picUrl;

        /**
         * <strong>example:</strong>
         * <p>170000000</p>
         */
        @NameInMap("serviceId")
        public Long serviceId;

        /**
         * <strong>example:</strong>
         * <p>哈哈</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>UN_RECOVERED</p>
         */
        @NameInMap("status")
        public Long status;

        public static GetProblemEffectionServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemEffectionServiceResponseBodyData self = new GetProblemEffectionServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemEffectionServiceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProblemEffectionServiceResponseBodyData setEffectionServiceId(Long effectionServiceId) {
            this.effectionServiceId = effectionServiceId;
            return this;
        }
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        public GetProblemEffectionServiceResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetProblemEffectionServiceResponseBodyData setPicUrl(java.util.List<String> picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public java.util.List<String> getPicUrl() {
            return this.picUrl;
        }

        public GetProblemEffectionServiceResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetProblemEffectionServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetProblemEffectionServiceResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
