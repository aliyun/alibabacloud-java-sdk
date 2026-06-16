// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPrimaryClientPublicKeyRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the client public key for the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
     */
    @NameInMap("ClientPublicKeyId")
    public String clientPublicKeyId;

    /**
     * <p>A client token used to ensure the idempotence of a request. You must generate a unique value for this parameter from your client. The token can contain only ASCII characters and cannot be more than 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
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

    public static SetPrimaryClientPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPrimaryClientPublicKeyRequest self = new SetPrimaryClientPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public SetPrimaryClientPublicKeyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetPrimaryClientPublicKeyRequest setClientPublicKeyId(String clientPublicKeyId) {
        this.clientPublicKeyId = clientPublicKeyId;
        return this;
    }
    public String getClientPublicKeyId() {
        return this.clientPublicKeyId;
    }

    public SetPrimaryClientPublicKeyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetPrimaryClientPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
