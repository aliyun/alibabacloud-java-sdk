// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretRequest extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("VersionId")
    public String versionId;

    public static RotateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        RotateSecretRequest self = new RotateSecretRequest();
        return TeaModel.build(map, self);
    }

    public RotateSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public RotateSecretRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
