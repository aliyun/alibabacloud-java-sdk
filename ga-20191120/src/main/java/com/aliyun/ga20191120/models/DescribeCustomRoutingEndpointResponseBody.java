// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The name of the endpoint (vSwitch).</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-test01</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the endpoint group to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the listener with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>String	04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID to which the managed instance belongs.</p>
     * <blockquote>
     * <p> Valid only when the ServiceManaged parameter is True.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Is it a managed instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>A list of action policies that users can execute on this managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The access policy of traffic for the specified endpoint. Valid values:</p>
     * <ul>
     * <li><strong>AllowAll</strong>: allows all traffic to the endpoint.</li>
     * <li><strong>DenyAll</strong>: denies all traffic to the endpoint.</li>
     * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DenyAll</p>
     */
    @NameInMap("TrafficToEndpointPolicy")
    public String trafficToEndpointPolicy;

    /**
     * <p>The backend service type of the endpoint.</p>
     * <p>Set the value to <strong>PrivateSubNet</strong>, which indicates private CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateSubNet</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCustomRoutingEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointResponseBody self = new DescribeCustomRoutingEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeCustomRoutingEndpointResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndpointResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeCustomRoutingEndpointResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeCustomRoutingEndpointResponseBody setServiceManagedInfos(java.util.List<DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeCustomRoutingEndpointResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeCustomRoutingEndpointResponseBody setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
        this.trafficToEndpointPolicy = trafficToEndpointPolicy;
        return this;
    }
    public String getTrafficToEndpointPolicy() {
        return this.trafficToEndpointPolicy;
    }

    public DescribeCustomRoutingEndpointResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos extends TeaModel {
        /**
         * <p>Managed policy action name, Valid values:</p>
         * <ul>
         * <li>Create</li>
         * <li>Update</li>
         * <li>Delete</li>
         * <li>Associate</li>
         * <li>UserUnmanaged</li>
         * <li>CreateChild</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Sub resource type, Valid values:</p>
         * <ul>
         * <li>Listener</li>
         * <li>IpSet</li>
         * <li>EndpointGroup</li>
         * <li>ForwardingRule</li>
         * <li>Endpoint</li>
         * <li>EndpointGroupDestination</li>
         * <li>EndpointPolicy</li>
         * </ul>
         * <blockquote>
         * <p>Only valid when the Action parameter is CreateChild.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Is the managed policy action managed, Valid values:</p>
         * <ul>
         * <li><p>true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
         * </li>
         * <li><p>false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos self = new DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeCustomRoutingEndpointResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

}
