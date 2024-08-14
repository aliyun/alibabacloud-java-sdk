// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <blockquote>
     * <p> You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>770dbe42-e146-43d1-a55a-1355db86****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <blockquote>
     * <p> You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08c33a6f-4e0a-4a1b-a3fa-7ddf****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the secret.</p>
     * <blockquote>
     * <p> You can configure only one of the KeyId, SecretName, and CertificateId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyDbC****</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>One or more tags that you want to add. The value is in the array format.</p>
     * <p>Tag attributes:</p>
     * <ul>
     * <li>TagKey: the tag key.</li>
     * <li>TagValue: the tag value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</p>
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
