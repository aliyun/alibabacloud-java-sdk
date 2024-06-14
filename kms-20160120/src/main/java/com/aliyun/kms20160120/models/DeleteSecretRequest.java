// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default value)</p>
     */
    @NameInMap("ForceDeleteWithoutRecovery")
    public String forceDeleteWithoutRecovery;

    /**
     * <p>Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. Unit: Days.</p>
     */
    @NameInMap("RecoveryWindowInDays")
    public String recoveryWindowInDays;

    /**
     * <p>The name of the secret.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
