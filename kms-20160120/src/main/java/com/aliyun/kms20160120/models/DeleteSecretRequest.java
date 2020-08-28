// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("ForceDeleteWithoutRecovery")
    public String forceDeleteWithoutRecovery;

    @NameInMap("RecoveryWindowInDays")
    public String recoveryWindowInDays;

    public static DeleteSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretRequest self = new DeleteSecretRequest();
        return TeaModel.build(map, self);
    }

}
