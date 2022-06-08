// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("SecretName")
    public String secretName;

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
