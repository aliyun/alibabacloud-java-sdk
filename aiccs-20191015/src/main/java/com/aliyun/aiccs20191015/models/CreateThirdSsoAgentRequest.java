// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateThirdSsoAgentRequest extends TeaModel {
    /**
     * <p>Account ID to synchronize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accountId1</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>Account name to synchronize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accountName1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The client ID issued to the tenant instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>Unique ID for the customer request. Used for idempotency validation and can be generated using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Agent display name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>AICCS instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of role IDs.</p>
     */
    @NameInMap("RoleIds")
    public java.util.List<Long> roleIds;

    /**
     * <p>List of skill group IDs.</p>
     */
    @NameInMap("SkillGroupIds")
    public java.util.List<Long> skillGroupIds;

    public static CreateThirdSsoAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdSsoAgentRequest self = new CreateThirdSsoAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateThirdSsoAgentRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateThirdSsoAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateThirdSsoAgentRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateThirdSsoAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateThirdSsoAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateThirdSsoAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateThirdSsoAgentRequest setRoleIds(java.util.List<Long> roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    public CreateThirdSsoAgentRequest setSkillGroupIds(java.util.List<Long> skillGroupIds) {
        this.skillGroupIds = skillGroupIds;
        return this;
    }
    public java.util.List<Long> getSkillGroupIds() {
        return this.skillGroupIds;
    }

}
