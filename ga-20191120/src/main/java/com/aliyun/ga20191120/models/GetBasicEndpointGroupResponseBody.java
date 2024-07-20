// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The description of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>BasicEndpointGroup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The address of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp1a05txelswuj8g****</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the endpoint group resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <p>This parameter is returned if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
     * <ul>
     * <li>If the endpoint type is <strong>ECS</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the primary ENI.</li>
     * <li>If the endpoint type is <strong>ENI</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the secondary ENI.</li>
     * <li>If the endpoint type is <strong>NLB</strong>, <strong>EndpointSubAddress</strong> returns the primary private IP address of the NLB backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of endpoint. Valid values:</p>
     * <ul>
     * <li><strong>ENI</strong>: elastic network interface (ENI).</li>
     * <li><strong>SLB</strong>: Classic Load Balancer (CLB) instance.</li>
     * <li><strong>ECS</strong>: Elastic Compute Service (ECS) instance.</li>
     * <li><strong>NLB</strong>: Network Load Balancer (NLB) instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENI</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The name of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the endpoint group. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: being initialized.</li>
     * <li><strong>active</strong>: running as expected.</li>
     * <li><strong>updating</strong>: being updated.</li>
     * <li><strong>deleting</strong>: being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointGroupResponseBody self = new GetBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBasicEndpointGroupResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public GetBasicEndpointGroupResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicEndpointGroupResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
