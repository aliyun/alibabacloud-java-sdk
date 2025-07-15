// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a41300c9-23d3-470e-b9bd-****663e0700</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the destination resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz7***34cn5ty</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCasterResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterResourceGroupRequest self = new UpdateCasterResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasterResourceGroupRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public UpdateCasterResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public UpdateCasterResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCasterResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
