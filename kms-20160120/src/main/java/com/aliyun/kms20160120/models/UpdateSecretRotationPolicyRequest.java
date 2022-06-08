// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyRequest extends TeaModel {
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretRotationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRotationPolicyRequest self = new UpdateSecretRotationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRotationPolicyRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public UpdateSecretRotationPolicyRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public UpdateSecretRotationPolicyRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
