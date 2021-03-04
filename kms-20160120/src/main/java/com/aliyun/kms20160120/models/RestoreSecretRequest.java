// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretRequest extends TeaModel {
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
