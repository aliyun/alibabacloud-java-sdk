// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <blockquote>
     * <p>You must specify one and only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>770dbe42-e146-43d1-a55a-1355db86****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the key. This is the globally unique identifier (GUID) of the master key (CMK).</p>
     * <blockquote>
     * <p>You must specify one and only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08c33a6f-4e0a-4a1b-a3fa-7ddf****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the credential.</p>
     * <blockquote>
     * <p>You must specify one and only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyDbC****</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).<br> You need to specify only tag keys, not tag values.<br> The tag key can be 1 to 128 bytes in length.<br><br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;tagkey1&quot;,&quot;tagkey2&quot;]</p>
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
