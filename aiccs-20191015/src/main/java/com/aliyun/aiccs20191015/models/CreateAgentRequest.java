// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("SkillGroupId")
    public java.util.List<Integer> skillGroupId;

    @NameInMap("SkillGroupIdList")
    public java.util.List<Integer> skillGroupIdList;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAgentRequest setSkillGroupId(java.util.List<Integer> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<Integer> getSkillGroupId() {
        return this.skillGroupId;
    }

    public CreateAgentRequest setSkillGroupIdList(java.util.List<Integer> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<Integer> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
