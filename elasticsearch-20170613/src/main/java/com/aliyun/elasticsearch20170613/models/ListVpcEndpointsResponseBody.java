// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the endpoints.</p>
     */
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
        /**
         * <p>The status of the endpoint connection. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Connecting</p>
         * <p>*   Connected</p>
         * <p>*   Disconnecting</p>
         * <p>*   Disconnected</p>
         * <p>*   Deleting</p>
         * <p>*   ServiceDeleted</p>
         */
        @NameInMap("connectionStatus")
        public String connectionStatus;

        /**
         * <p>The time when the endpoint was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The business status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   FinancialLocked</p>
         */
        @NameInMap("endpointBusinessStatus")
        public String endpointBusinessStatus;

        /**
         * <p>The domain name of the endpoint. The domain name is used for connection configuration.</p>
         */
        @NameInMap("endpointDomain")
        public String endpointDomain;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         */
        @NameInMap("endpointName")
        public String endpointName;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <p>*   Active</p>
         * <p>*   Pending</p>
         * <p>*   Deleting</p>
         */
        @NameInMap("endpointStatus")
        public String endpointStatus;

        /**
         * <p>The ID of the endpoint service with which the endpoint is associated.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service with which the endpoint is associated.</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        public static ListVpcEndpointsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyResult self = new ListVpcEndpointsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyResult setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVpcEndpointsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }
        public String getEndpointBusinessStatus() {
            return this.endpointBusinessStatus;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListVpcEndpointsResponseBodyResult setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        public ListVpcEndpointsResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointsResponseBodyResult setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
