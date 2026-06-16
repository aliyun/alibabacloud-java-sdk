// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialDescriptionRequest extends TeaModel {
    /**
     * <p>Ensures idempotence. Generate a unique value on your client for each request. The ClientToken value must contain only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to Ensure Idempotence</a>.</p>
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
     * <p>The description of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCredentialDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialDescriptionRequest self = new UpdateCredentialDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCredentialDescriptionRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public UpdateCredentialDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
