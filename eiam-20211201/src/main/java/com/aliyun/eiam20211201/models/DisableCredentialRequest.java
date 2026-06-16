// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCredentialRequest extends TeaModel {
    /**
     * <p>Ensure idempotence. Generate a unique value on your client for each request. ClientToken supports only ASCII characters and must be no longer than 64 characters. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to Ensure Idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CredentialId")
    public String credentialId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCredentialRequest self = new DisableCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DisableCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableCredentialRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public DisableCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
