// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The description of the user. The description must be 0 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Senior data analyst</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the user. The display name must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice Wang</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice.wang@example.com">alice.wang@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li>Enabled: The user is enabled.</li>
     * <li>Disabled: The user is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The username of the user to be updated. The username can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length.</p>
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

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateUserRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
