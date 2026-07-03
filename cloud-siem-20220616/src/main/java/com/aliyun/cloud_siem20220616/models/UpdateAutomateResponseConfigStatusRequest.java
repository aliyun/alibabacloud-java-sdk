// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateAutomateResponseConfigStatusRequest extends TeaModel {
    /**
     * <p>A JSON array of automated response rule IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[123,345]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The enabling status of the rule. Valid values:</p>
     * <ul>
     * <li><p>true: enabled</p>
     * </li>
     * <li><p>false: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InUse")
    public Boolean inUse;

    /**
     * <p>The region where the Data Management center for threat analysis is deployed. You must select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account that the administrator wants to access.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static UpdateAutomateResponseConfigStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutomateResponseConfigStatusRequest self = new UpdateAutomateResponseConfigStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutomateResponseConfigStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public UpdateAutomateResponseConfigStatusRequest setInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }
    public Boolean getInUse() {
        return this.inUse;
    }

    public UpdateAutomateResponseConfigStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAutomateResponseConfigStatusRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateAutomateResponseConfigStatusRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
