// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetApiRuleRequest extends TeaModel {
    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static SetApiRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApiRuleRequest self = new SetApiRuleRequest();
        return TeaModel.build(map, self);
    }

    public SetApiRuleRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public SetApiRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetApiRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public SetApiRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public SetApiRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetApiRuleRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
