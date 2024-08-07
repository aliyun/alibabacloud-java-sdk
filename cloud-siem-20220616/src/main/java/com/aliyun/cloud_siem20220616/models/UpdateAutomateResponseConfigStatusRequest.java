// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateAutomateResponseConfigStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the automatic response rules. The value is a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[123,345]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether the rule is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InUse")
    public Boolean inUse;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
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
