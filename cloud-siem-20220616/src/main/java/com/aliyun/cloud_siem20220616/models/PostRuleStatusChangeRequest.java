// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostRuleStatusChangeRequest extends TeaModel {
    /**
     * <p>A JSON array of rule IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[123,345]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The status of the rule. Valid values:</p>
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
     * <p>The region where the Data Management center of threat analysis is located. Select a region based on the location of your assets. Valid values:</p>
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
     * <p>The user ID of a member. An administrator can specify this parameter to switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><p>predefine: predefined rule</p>
     * </li>
     * <li><p>customize: custom rule</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static PostRuleStatusChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        PostRuleStatusChangeRequest self = new PostRuleStatusChangeRequest();
        return TeaModel.build(map, self);
    }

    public PostRuleStatusChangeRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public PostRuleStatusChangeRequest setInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }
    public Boolean getInUse() {
        return this.inUse;
    }

    public PostRuleStatusChangeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostRuleStatusChangeRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostRuleStatusChangeRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public PostRuleStatusChangeRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
