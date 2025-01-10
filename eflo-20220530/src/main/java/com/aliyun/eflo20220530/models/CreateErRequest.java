// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRequest extends TeaModel {
    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Lingjun HUB Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-wulanchabu-main</p>
     */
    @NameInMap("ErName")
    public String erName;

    /**
     * <p>Primary Zone</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuzlx2iihcy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateErRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErRequest self = new CreateErRequest();
        return TeaModel.build(map, self);
    }

    public CreateErRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateErRequest setErName(String erName) {
        this.erName = erName;
        return this;
    }
    public String getErName() {
        return this.erName;
    }

    public CreateErRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CreateErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateErRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
