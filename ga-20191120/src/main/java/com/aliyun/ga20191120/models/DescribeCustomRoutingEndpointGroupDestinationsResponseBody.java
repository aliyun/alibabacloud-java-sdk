// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the endpoint group mapping configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>dst-123abc****</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The start port of the backend service port range of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("FromPort")
    public Integer fromPort;

    /**
     * <p>The ID of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The backend service protocol of the endpoint group.</p>
     * <ul>
     * <li><strong>TCP</strong>: TCP</li>
     * <li><strong>UDP</strong>: UDP</li>
     * <li><strong>TCP,UDP</strong>: TCP and UDP</li>
     * </ul>
     */
    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
    public java.util.List<DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the endpoint group mapping configuration.</p>
     * <ul>
     * <li><strong>init</strong>: being initialized.</li>
     * <li><strong>active</strong>: normal.</li>
     * <li><strong>updating</strong>: being updated.</li>
     * <li><strong>deleting</strong>: being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The end port of the backend service port range of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ToPort")
    public Integer toPort;

    public static DescribeCustomRoutingEndpointGroupDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupDestinationsResponseBody self = new DescribeCustomRoutingEndpointGroupDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    public Integer getFromPort() {
        return this.fromPort;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setServiceManagedInfos(java.util.List<DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody setToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    public Integer getToPort() {
        return this.toPort;
    }

    public static class DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos extends TeaModel {
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

        public static DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos self = new DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeCustomRoutingEndpointGroupDestinationsResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

}
