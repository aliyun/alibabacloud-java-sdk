// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddAgentRequest extends TeaModel {
    /**
     * <p>坐席账号名(必须唯一)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>seat_001</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>合作方唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("AgentTag")
    public String agentTag;

    /**
     * <p>分机密码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gwegwe23t32</p>
     */
    @NameInMap("ExtensionPwd")
    public String extensionPwd;

    /**
     * <p>坐席名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>坐席账号密码 (可以跟分机密码一致)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gwegwe23t32</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAgentRequest self = new AddAgentRequest();
        return TeaModel.build(map, self);
    }

    public AddAgentRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AddAgentRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public AddAgentRequest setExtensionPwd(String extensionPwd) {
        this.extensionPwd = extensionPwd;
        return this;
    }
    public String getExtensionPwd() {
        return this.extensionPwd;
    }

    public AddAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddAgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAgentRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddAgentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
