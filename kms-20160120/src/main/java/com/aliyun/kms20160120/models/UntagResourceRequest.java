// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <br>
     * <p>>  You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <br>
     * <p>>  You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the secret.</p>
     * <br>
     * <p>>  You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).</p>
     * <br>
     * <p>You need to specify only the tag keys, not the tag values.</p>
     * <br>
     * <p>Each tag key must be 1 to 128 bytes in length.</p>
     */
    @NameInMap("TagKeys")
    public String tagKeys;

    public static UntagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceRequest self = new UntagResourceRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourceRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public UntagResourceRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public UntagResourceRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public UntagResourceRequest setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

}
