// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The status of the logs.</p>
     * <br>
     * <p>*   **on**: associated</p>
     * <p>*   **off**: not associated</p>
     * <p>*   **binding**: being associated</p>
     * <p>*   **unbinding**: being disassociated</p>
     */
    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    /**
     * <p>The description of the endpoint group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether access logging is enabled.</p>
     * <br>
     * <p>*   **on**: enabled</p>
     * <p>*   **off**: disabled</p>
     */
    @NameInMap("EnableAccessLog")
    public Boolean enableAccessLog;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The list of endpoint group IP addresses.</p>
     */
    @NameInMap("EndpointGroupIpList")
    public java.util.List<String> endpointGroupIpList;

    /**
     * <p>The ID of the region where the endpoint group is created.</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The endpoint group IP addresses to be confirmed after the GA instance is upgraded.</p>
     */
    @NameInMap("EndpointGroupUnconfirmedIpList")
    public java.util.List<String> endpointGroupUnconfirmedIpList;

    /**
     * <p>The ID of the custom routing listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the endpoint group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    /**
     * <p>The name of the Log Service project.</p>
     */
    @NameInMap("SlsProjectName")
    public String slsProjectName;

    /**
     * <p>The region of the logs that are created in Log Service.</p>
     */
    @NameInMap("SlsRegion")
    public String slsRegion;

    /**
     * <p>The status of the endpoint group.</p>
     * <br>
     * <p>*   **init**: being initialized</p>
     * <p>*   **active**: running as expected</p>
     * <p>*   **updating**: being updated</p>
     * <p>*   **deleting**: being deleted</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeCustomRoutingEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndpointGroupResponseBody self = new DescribeCustomRoutingEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setAccessLogSwitch(String accessLogSwitch) {
        this.accessLogSwitch = accessLogSwitch;
        return this;
    }
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setEnableAccessLog(Boolean enableAccessLog) {
        this.enableAccessLog = enableAccessLog;
        return this;
    }
    public Boolean getEnableAccessLog() {
        return this.enableAccessLog;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setEndpointGroupIpList(java.util.List<String> endpointGroupIpList) {
        this.endpointGroupIpList = endpointGroupIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupIpList() {
        return this.endpointGroupIpList;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setEndpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
        this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
        return this.endpointGroupUnconfirmedIpList;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setSlsLogStoreName(String slsLogStoreName) {
        this.slsLogStoreName = slsLogStoreName;
        return this;
    }
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setSlsRegion(String slsRegion) {
        this.slsRegion = slsRegion;
        return this;
    }
    public String getSlsRegion() {
        return this.slsRegion;
    }

    public DescribeCustomRoutingEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
