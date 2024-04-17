// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostRuleStatusChangeRequest extends TeaModel {
    /**
     * <p>The rule IDs. The value is a JSON array.</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to enable the rule. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("InUse")
    public Boolean inUse;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   predefine</p>
     * <p>*   customize</p>
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
