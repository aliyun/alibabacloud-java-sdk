// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretRequest extends TeaModel {
    @NameInMap("ForceDeleteWithoutRecovery")
    public String forceDeleteWithoutRecovery;

    @NameInMap("RecoveryWindowInDays")
    public String recoveryWindowInDays;

    @NameInMap("SecretName")
    public String secretName;

    public static DeleteSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretRequest self = new DeleteSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretRequest setForceDeleteWithoutRecovery(String forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
        return this;
    }
    public String getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    public DeleteSecretRequest setRecoveryWindowInDays(String recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
        return this;
    }
    public String getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    public DeleteSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
