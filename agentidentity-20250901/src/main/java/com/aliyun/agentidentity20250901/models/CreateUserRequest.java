// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The description of the user. It must be 0 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Data Analyst</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the user. It must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled.</li>
     * <li>Disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The username. It can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateUserRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
