// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationClientSecretRequest extends TeaModel {
    // IDaaS的应用主键id
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM的实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // OIDC 场景下用于客户端身份验证的客户端密钥
    @NameInMap("SecretId")
    public String secretId;

    public static DeleteApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationClientSecretRequest self = new DeleteApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeleteApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteApplicationClientSecretRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
