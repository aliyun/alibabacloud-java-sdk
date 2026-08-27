// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The authentication method.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("AuthMethod")
    public String authMethod;

    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo User</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:demo@example.com">demo@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-test-001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The note.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUser.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The password. If not specified, the system automatically generates an initial password.</p>
     * 
     * <strong>example:</strong>
     * <p>P@ssw0rd123</p>
     */
    @NameInMap("Password")
    public String password;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    public String getAuthMethod() {
        return this.authMethod;
    }

    public CreateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
