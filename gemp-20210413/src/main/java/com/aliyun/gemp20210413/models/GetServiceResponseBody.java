// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    // 服务详情
    @NameInMap("data")
    public GetServiceResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setData(GetServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceResponseBodyData getData() {
        return this.data;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceResponseBodyData extends TeaModel {
        // 服务描述
        @NameInMap("serviceDescription")
        public String serviceDescription;

        // 服务ID
        @NameInMap("serviceId")
        public Long serviceId;

        // 服务名字
        @NameInMap("serviceName")
        public String serviceName;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        public static GetServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyData self = new GetServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public GetServiceResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
