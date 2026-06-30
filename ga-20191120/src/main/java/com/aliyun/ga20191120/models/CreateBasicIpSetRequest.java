// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetRequest extends TeaModel {
    /**
     * <p>The ID of the region to be accelerated.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/261190.html">ListAvailableBusiRegions</a> operation to query the active acceleration regions for the specified Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The instance ID of the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth of the acceleration area. Unit: <strong>Mbps</strong>.</p>
     * <p>The minimum bandwidth that can be allocated to an acceleration area is 2 Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ISP type of the public network in the acceleration region. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP)</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro</li>
     * </ul>
     * <p>If you are a whitelist user of single-ISP bandwidth, you can also select the following types:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP)</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP)</li>
     * <li><strong>ChinaMobile</strong>: China Shift (single ISP)</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom (single ISP)_L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom (single ISP)_L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Shift (single ISP)_L2<blockquote>
     * <ul>
     * <li>This parameter is required for basic Alibaba Cloud Global Accelerator (GA) instances that use the <strong>pay-by-traffic</strong> billing method.</li>
     * <li>If the acceleration region of the basic Alibaba Cloud Global Accelerator (GA) instance is Hong Kong (China) and the instance is attached with a basic bandwidth plan of the BGP (Multi-ISP) Pro type, the default value is BGP (Multi-ISP) Pro.</li>
     * <li>The supported single-ISP line types vary by acceleration region.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The region ID of the basic Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>ap-southeast-1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetRequest self = new CreateBasicIpSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetRequest setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public CreateBasicIpSetRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicIpSetRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateBasicIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicIpSetRequest setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

    public CreateBasicIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
