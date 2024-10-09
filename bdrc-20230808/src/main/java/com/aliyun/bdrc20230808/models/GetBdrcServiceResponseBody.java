// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetBdrcServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBdrcServiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5748C531-80B1-5C31-8421-63A1830B9E48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBdrcServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBdrcServiceResponseBody self = new GetBdrcServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBdrcServiceResponseBody setData(GetBdrcServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBdrcServiceResponseBodyData getData() {
        return this.data;
    }

    public GetBdrcServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBdrcServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1726169608</p>
         */
        @NameInMap("OpenTime")
        public Long openTime;

        /**
         * <strong>example:</strong>
         * <p>1726169608</p>
         */
        @NameInMap("ProtectionScoreUpdatedTime")
        public Long protectionScoreUpdatedTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ServiceInitializeStatus")
        public String serviceInitializeStatus;

        /**
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        public static GetBdrcServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBdrcServiceResponseBodyData self = new GetBdrcServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBdrcServiceResponseBodyData setOpenTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }
        public Long getOpenTime() {
            return this.openTime;
        }

        public GetBdrcServiceResponseBodyData setProtectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
            this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
            return this;
        }
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        public GetBdrcServiceResponseBodyData setServiceInitializeStatus(String serviceInitializeStatus) {
            this.serviceInitializeStatus = serviceInitializeStatus;
            return this;
        }
        public String getServiceInitializeStatus() {
            return this.serviceInitializeStatus;
        }

        public GetBdrcServiceResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
