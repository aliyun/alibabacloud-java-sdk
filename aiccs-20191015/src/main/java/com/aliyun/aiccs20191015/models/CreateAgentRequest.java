// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    // js sdk中自动生成的鉴权token
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public java.util.List<Long> skillGroupId;

    @NameInMap("SkillGroupIdList")
    public java.util.List<Long> skillGroupIdList;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAgentRequest setSkillGroupId(java.util.List<Long> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<Long> getSkillGroupId() {
        return this.skillGroupId;
    }

    public CreateAgentRequest setSkillGroupIdList(java.util.List<Long> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<Long> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
