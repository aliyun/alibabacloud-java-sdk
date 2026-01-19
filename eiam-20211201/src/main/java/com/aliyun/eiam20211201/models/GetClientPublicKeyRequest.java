// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetClientPublicKeyRequest extends TeaModel {
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
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetClientPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientPublicKeyRequest self = new GetClientPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetClientPublicKeyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetClientPublicKeyRequest setClientPublicKeyId(String clientPublicKeyId) {
        this.clientPublicKeyId = clientPublicKeyId;
        return this;
    }
    public String getClientPublicKeyId() {
        return this.clientPublicKeyId;
    }

    public GetClientPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
