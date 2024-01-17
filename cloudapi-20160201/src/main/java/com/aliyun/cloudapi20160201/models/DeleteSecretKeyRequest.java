// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteSecretKeyRequest extends TeaModel {
    @NameInMap("SecretKeyId")
    public String secretKeyId;

    public static DeleteSecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretKeyRequest self = new DeleteSecretKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretKeyRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

}
