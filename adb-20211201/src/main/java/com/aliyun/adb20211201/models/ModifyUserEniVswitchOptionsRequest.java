// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyUserEniVswitchOptionsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The vSwitches that you want to use. The vSwitches must reside in the same virtual private cloud (VPC) and zone as ENIs. You can specify up to three vSwitches. Separate multiple vSwitches with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The vSwitches that you specify overwrite the existing vSwitches that are connected to ENIs.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/612399.html">DescribeDBClusterAttribute</a> operation to query the network information about ENIs in a cluster.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-rj9ixufmywqq98z******,vsw-rj95ij6wcz656v7******</p>
     */
    @NameInMap("VSwitchOptions")
    public String vSwitchOptions;

    public static ModifyUserEniVswitchOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEniVswitchOptionsRequest self = new ModifyUserEniVswitchOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserEniVswitchOptionsRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public ModifyUserEniVswitchOptionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyUserEniVswitchOptionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUserEniVswitchOptionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserEniVswitchOptionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyUserEniVswitchOptionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyUserEniVswitchOptionsRequest setVSwitchOptions(String vSwitchOptions) {
        this.vSwitchOptions = vSwitchOptions;
        return this;
    }
    public String getVSwitchOptions() {
        return this.vSwitchOptions;
    }

}
