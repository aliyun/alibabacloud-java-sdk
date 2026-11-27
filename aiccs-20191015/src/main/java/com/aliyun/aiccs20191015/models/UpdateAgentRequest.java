// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <p>The account name of the agent, which is the mobile phone number or email address specified during account registration. The account name must be unique within the instance.</p>
     * <blockquote>
     * <p>This parameter cannot be updated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The unique ID of the client request. This parameter is used for idempotence verification. You can use a UUID to generate the value.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The display name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XX Test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the Artificial Intelligence Cloud Call Service instance.
     * You can obtain the instance ID from <b>Instance Management</b> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The skill group to which the agent belongs.</p>
     */
    @NameInMap("SkillGroupId")
    public java.util.List<Long> skillGroupId;

    /**
     * <p>The list of skill groups to which the agent belongs.</p>
     */
    @NameInMap("SkillGroupIdList")
    public java.util.List<Long> skillGroupIdList;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public UpdateAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAgentRequest setSkillGroupId(java.util.List<Long> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<Long> getSkillGroupId() {
        return this.skillGroupId;
    }

    public UpdateAgentRequest setSkillGroupIdList(java.util.List<Long> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<Long> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
