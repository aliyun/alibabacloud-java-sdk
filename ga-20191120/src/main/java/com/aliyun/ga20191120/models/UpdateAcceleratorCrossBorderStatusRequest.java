// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderStatusRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
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
     * <p>Specifies whether to enable the cross-border acceleration feature for the GA instance. Valid values:</p>
     * <br>
     * <p>- **true**</p>
     * <p>- **false**</p>
     */
    @NameInMap("CrossBorderStatus")
    public Boolean crossBorderStatus;

    /**
     * <p>The region ID of the GA instance. Set the value to cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAcceleratorCrossBorderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorCrossBorderStatusRequest self = new UpdateAcceleratorCrossBorderStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorCrossBorderStatusRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorCrossBorderStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAcceleratorCrossBorderStatusRequest setCrossBorderStatus(Boolean crossBorderStatus) {
        this.crossBorderStatus = crossBorderStatus;
        return this;
    }
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
    }

    public UpdateAcceleratorCrossBorderStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
