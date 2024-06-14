// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretRequest extends TeaModel {
    /**
     * <p>The name of the secret you want to restore.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static RestoreSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreSecretRequest self = new RestoreSecretRequest();
        return TeaModel.build(map, self);
    }

    public RestoreSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
