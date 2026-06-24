// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateOpenSourceAccountRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent repeated submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>f6af6bb123988d191bfe01c9a9b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-20p****04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The account password.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myname</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateOpenSourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpenSourceAccountRequest self = new UpdateOpenSourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOpenSourceAccountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateOpenSourceAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOpenSourceAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateOpenSourceAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateOpenSourceAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
