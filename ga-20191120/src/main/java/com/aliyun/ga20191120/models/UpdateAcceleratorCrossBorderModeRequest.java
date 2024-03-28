// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderModeRequest extends TeaModel {
    /**
     * <p>The GA instance ID.</p>
     * <br>
     * <p>> The bandwidth metering method of the GA instance must be pay-by-data-transfer.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of transmission network of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **bgpPro**: BGP (Multi-ISP) Pro. BGP (Multi-ISP) Pro lines are used for cross-border acceleration. You do not need to complete real-name verification.</p>
     * <p>*   **private**: cross-border Express Connect circuit. Cross-border Express Connect circuits provide better acceleration performance but require real-name verification.</p>
     */
    @NameInMap("CrossBorderMode")
    public String crossBorderMode;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
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
