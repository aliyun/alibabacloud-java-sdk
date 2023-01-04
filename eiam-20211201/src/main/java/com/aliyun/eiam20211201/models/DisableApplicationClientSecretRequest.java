// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationClientSecretRequest extends TeaModel {
    // IDaaS的应用主键id
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM的实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // OIDC 场景下用于客户端身份验证的客户端密钥ID
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
