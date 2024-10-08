// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>770dbe42-e146-43d1-a55a-1355db86****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>08c33a6f-4e0a-4a1b-a3fa-7ddf****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p>MyDbC****</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
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
