// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderModeRequest extends TeaModel {
    /**
     * <p>The GA instance ID.</p>
     * <blockquote>
     * <p>The bandwidth metering method of the GA instance must be pay-by-data-transfer.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of transmission network of the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>bgpPro</strong>: BGP (Multi-ISP) Pro. BGP (Multi-ISP) Pro lines are used for cross-border acceleration. You do not need to complete real-name verification.</li>
     * <li><strong>private</strong>: cross-border Express Connect circuit. Cross-border Express Connect circuits provide better acceleration performance but require real-name verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bgpPro</p>
     */
    @NameInMap("CrossBorderMode")
    public String crossBorderMode;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAcceleratorCrossBorderModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorCrossBorderModeRequest self = new UpdateAcceleratorCrossBorderModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorCrossBorderModeRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorCrossBorderModeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAcceleratorCrossBorderModeRequest setCrossBorderMode(String crossBorderMode) {
        this.crossBorderMode = crossBorderMode;
        return this;
    }
    public String getCrossBorderMode() {
        return this.crossBorderMode;
    }

    public UpdateAcceleratorCrossBorderModeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
