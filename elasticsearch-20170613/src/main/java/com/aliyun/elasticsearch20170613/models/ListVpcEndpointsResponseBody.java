// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
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
         * <ul>
         * <li>Pending</li>
         * <li>Connecting</li>
         * <li>Connected</li>
         * <li>Disconnecting</li>
         * <li>Disconnected</li>
         * <li>Deleting</li>
         * <li>ServiceDeleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("connectionStatus")
        public String connectionStatus;

        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-22T01:19:24Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The business status of the endpoint. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>FinancialLocked</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("endpointBusinessStatus")
        public String endpointBusinessStatus;

        /**
         * <p>The domain name of the endpoint. The domain name is used for connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp18s6wy9420wdi4****.epsrv-bp1bz3efowa4kc0****.cn-hangzhou.privatelink.aliyuncs.com</p>
         */
        @NameInMap("endpointDomain")
        public String endpointDomain;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1tah7zbrwmkjef****</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("endpointName")
        public String endpointName;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Active</li>
         * <li>Pending</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("endpointStatus")
        public String endpointStatus;

        /**
         * <p>The ID of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-bp1w0p3jdirbfmt6****</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-hangzhou.epsrv-bp1w0p3jdirbfmt6****</p>
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
