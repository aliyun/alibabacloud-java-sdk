// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
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
     * <p>One or more tags that you want to add. The value is in the array format.</p>
     * <br>
     * <p>Tag attributes:</p>
     * <br>
     * <p>*   TagKey: the tag key.</p>
     * <p>*   TagValue: the tag value.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static TagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceRequest self = new TagResourceRequest();
        return TeaModel.build(map, self);
    }

    public TagResourceRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public TagResourceRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public TagResourceRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public TagResourceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
