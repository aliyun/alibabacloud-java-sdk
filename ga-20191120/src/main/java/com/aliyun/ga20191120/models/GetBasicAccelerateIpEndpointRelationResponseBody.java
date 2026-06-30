// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationResponseBody extends TeaModel {
    /**
     * <p>The accelerated IP address instance ID of the basic Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gaip-bp1****</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The instance ID of the basic Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp11v53zfftax68b0daws</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The address of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp1a05txelswuj8g****</p>
     */
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    /**
     * <p>The endpoint ID of the basic Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint of the basic Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ep01</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The secondary address of the endpoint.</p>
     * <p>This parameter is returned when the endpoint type attached to the accelerated IP address is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
     * <ul>
     * <li>If the endpoint type is <strong>ECS</strong>, EndpointSubAddress is the secondary private IP address or the primary private IP address of the primary network interface controller (NIC).</li>
     * <li>If the endpoint type is <strong>ENI</strong>, EndpointSubAddress is the secondary private IP address or the primary private IP address of the secondary elastic network interface (ENI).</li>
     * <li>If the endpoint type is <strong>NLB</strong>, EndpointSubAddress is the primary private IP address of the NLB backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    /**
     * <p>The type of the secondary address of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: The secondary address type is the primary private IP address.</li>
     * <li><strong>secondary</strong>: The secondary address type is the secondary private IP address.</li>
     * </ul>
     * <p>This parameter is returned when the endpoint type bound to the accelerated IP address is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is <strong>NLB</strong>, only <strong>primary</strong> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    /**
     * <p>The endpoint type. Valid values:</p>
     * <ul>
     * <li><strong>ENI</strong>: an Alibaba Cloud elastic network interface (ENI).</li>
     * <li><strong>SLB</strong>: an Alibaba Cloud Classic Load Balancer (CLB) instance.</li>
     * <li><strong>ECS</strong>: an Alibaba Cloud ECS instance.</li>
     * <li><strong>NLB</strong>: an Alibaba Cloud Network Load Balancer (NLB) instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENI</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The zone ID of the endpoint.</p>
     * <p>Currently, this parameter is returned only when the endpoint type bound to the accelerated IP address is <strong>NLB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    /**
     * <p>The accelerated IP address of the basic Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>116.132.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the attachment between the accelerated IP address and the endpoint of the basic Global Accelerator (GA) instance.</p>
     * <p>The value <strong>active</strong> indicates that the accelerated IP address is attached to the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicAccelerateIpEndpointRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationResponseBody self = new GetBasicAccelerateIpEndpointRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
