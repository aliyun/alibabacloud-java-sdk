// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationServerRequest extends TeaModel {
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
     * <p>The name of the authorization server.</p>
     * 
     * <strong>example:</strong>
     * <p>my_authorization_server</p>
     */
    @NameInMap("AuthorizationServerName")
    public String authorizationServerName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc123xyz</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name used by the issuer.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx.aliyunidaas.com</p>
     */
    @NameInMap("IssuerDomain")
    public String issuerDomain;

    /**
     * <p>The issuer mode.</p>
     * 
     * <strong>example:</strong>
     * <p>dynamic</p>
     */
    @NameInMap("IssuerMode")
    public String issuerMode;

    public static UpdateAuthorizationServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationServerRequest self = new UpdateAuthorizationServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationServerRequest setAuthorizationServerId(String authorizationServerId) {
        this.authorizationServerId = authorizationServerId;
        return this;
    }
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    public UpdateAuthorizationServerRequest setAuthorizationServerName(String authorizationServerName) {
        this.authorizationServerName = authorizationServerName;
        return this;
    }
    public String getAuthorizationServerName() {
        return this.authorizationServerName;
    }

    public UpdateAuthorizationServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAuthorizationServerRequest setIssuerDomain(String issuerDomain) {
        this.issuerDomain = issuerDomain;
        return this;
    }
    public String getIssuerDomain() {
        return this.issuerDomain;
    }

    public UpdateAuthorizationServerRequest setIssuerMode(String issuerMode) {
        this.issuerMode = issuerMode;
        return this;
    }
    public String getIssuerMode() {
        return this.issuerMode;
    }

}
