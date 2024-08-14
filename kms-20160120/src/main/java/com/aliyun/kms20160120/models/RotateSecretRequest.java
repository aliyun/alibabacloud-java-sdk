// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretRequest extends TeaModel {
    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RdsSecret/Mysql5.4/MyCred</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version number of the secret after the secret is rotated.</p>
     * <blockquote>
     * <p> The version number is used to ensure the idempotence of the request. Secrets Manager uses this version number to prevent your application from creating the same version of the secret when the application retries a request. If a version number already exists, Secrets Manager ignores the request for rotation and returns a success message.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>000000123</p>
     */
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
