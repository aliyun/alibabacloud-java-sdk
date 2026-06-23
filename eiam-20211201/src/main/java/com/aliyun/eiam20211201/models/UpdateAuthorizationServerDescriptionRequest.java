// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationServerDescriptionRequest extends TeaModel {
    /**
     * <p>The authorization server ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iauths_system</p>
     */
    @NameInMap("AuthorizationServerId")
    public String authorizationServerId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique among different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, refer to References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc123xyz</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the authorization server.</p>
     * 
     * <strong>example:</strong>
     * <p>description of authorization server</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateAuthorizationServerDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationServerDescriptionRequest self = new UpdateAuthorizationServerDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationServerDescriptionRequest setAuthorizationServerId(String authorizationServerId) {
        this.authorizationServerId = authorizationServerId;
        return this;
    }
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    public UpdateAuthorizationServerDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationServerDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAuthorizationServerDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
