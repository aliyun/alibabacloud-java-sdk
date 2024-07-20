// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeLogStoreOfEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-xxxxxxxxxxxxx</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-xxxxxxxxxxxxxxx</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-xxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1777E713-8456-55F1-9A69-9AD9EAE2B3B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>ga_log</p>
     */
    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>ga_project_name</p>
     */
    @NameInMap("SlsProjectName")
    public String slsProjectName;

    /**
     * <p>The region ID of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>Indicates whether the endpoint group is bound to the Simple Log Service project.</p>
     * <ul>
     * <li><strong>on:</strong> The endpoint group is bound to the Simple Log Service project.</li>
     * <li><strong>off:</strong> The endpoint group is not bound to the Simple Log Service project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on - binding
     * off - unbinding</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeLogStoreOfEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreOfEndpointGroupResponseBody self = new DescribeLogStoreOfEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setSlsLogStoreName(String slsLogStoreName) {
        this.slsLogStoreName = slsLogStoreName;
        return this;
    }
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public DescribeLogStoreOfEndpointGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
