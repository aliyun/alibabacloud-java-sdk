// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationClientSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application whose client key you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The client key ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    public static ObtainApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainApplicationClientSecretRequest self = new ObtainApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public ObtainApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ObtainApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ObtainApplicationClientSecretRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
