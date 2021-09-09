// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListVpcEndpointsResponseBodyResult> result;

    public static ListVpcEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponseBody self = new ListVpcEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointsResponseBody setResult(java.util.List<ListVpcEndpointsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListVpcEndpointsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListVpcEndpointsResponseBodyResult extends TeaModel {
        @NameInMap("endpointBusinessStatus")
        public String endpointBusinessStatus;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("endpointName")
        public String endpointName;

        @NameInMap("endpointId")
        public String endpointId;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("connectionStatus")
        public String connectionStatus;

        @NameInMap("endpointDomain")
        public String endpointDomain;

        @NameInMap("endpointStatus")
        public String endpointStatus;

        public static ListVpcEndpointsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyResult self = new ListVpcEndpointsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyResult setEndpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }
        public String getEndpointBusinessStatus() {
            return this.endpointBusinessStatus;
        }

        public ListVpcEndpointsResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcEndpointsResponseBodyResult setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointsResponseBodyResult setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

    }

}
