// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableClientPublicKeyRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用ClientPublicKey的ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
     */
    @NameInMap("ClientPublicKeyId")
    public String clientPublicKeyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableClientPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableClientPublicKeyRequest self = new DisableClientPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public DisableClientPublicKeyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableClientPublicKeyRequest setClientPublicKeyId(String clientPublicKeyId) {
        this.clientPublicKeyId = clientPublicKeyId;
        return this;
    }
    public String getClientPublicKeyId() {
        return this.clientPublicKeyId;
    }

    public DisableClientPublicKeyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableClientPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
