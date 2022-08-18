// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationClientSecretRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecretId")
    public String secretId;

    public static EnableApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationClientSecretRequest self = new EnableApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public EnableApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableApplicationClientSecretRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
