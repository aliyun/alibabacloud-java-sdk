// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GetProblemEffectionServiceResponseBodyData data;

    public static GetProblemEffectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceResponseBody self = new GetProblemEffectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProblemEffectionServiceResponseBody setData(GetProblemEffectionServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProblemEffectionServiceResponseBodyData getData() {
        return this.data;
    }

    public static class GetProblemEffectionServiceResponseBodyData extends TeaModel {
        // 影响服务id
        @NameInMap("effectionServiceId")
        public Long effectionServiceId;

        // 服务名称
        @NameInMap("serviceName")
        public String serviceName;

        // 服务id
        @NameInMap("serviceId")
        public Long serviceId;

        // 影响等级
        @NameInMap("level")
        public Long level;

        // 影响状态 0 未恢复 1已恢复
        @NameInMap("status")
        public Long status;

        // 影响描述
        @NameInMap("description")
        public String description;

        // 图片链接
        @NameInMap("picUrl")
        public java.util.List<String> picUrl;

        public static GetProblemEffectionServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemEffectionServiceResponseBodyData self = new GetProblemEffectionServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemEffectionServiceResponseBodyData setEffectionServiceId(Long effectionServiceId) {
            this.effectionServiceId = effectionServiceId;
            return this;
        }
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        public GetProblemEffectionServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetProblemEffectionServiceResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetProblemEffectionServiceResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetProblemEffectionServiceResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetProblemEffectionServiceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProblemEffectionServiceResponseBodyData setPicUrl(java.util.List<String> picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public java.util.List<String> getPicUrl() {
            return this.picUrl;
        }

    }

}
