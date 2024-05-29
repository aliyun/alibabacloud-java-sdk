// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationClientSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application for which you want to disable a client key.</p>
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

    public static DisableApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationClientSecretRequest self = new DisableApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableApplicationClientSecretRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
