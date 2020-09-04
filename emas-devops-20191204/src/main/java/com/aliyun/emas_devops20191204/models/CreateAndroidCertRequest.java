// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateAndroidCertRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("Certificate")
    @Validation(required = true)
    public String certificate;

    @NameInMap("Credential")
    @Validation(required = true)
    public String credential;

    @NameInMap("KeyAlias")
    @Validation(required = true)
    public String keyAlias;

    @NameInMap("KeyPassword")
    @Validation(required = true)
    public String keyPassword;

    public static CreateAndroidCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidCertRequest self = new CreateAndroidCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndroidCertRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateAndroidCertRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAndroidCertRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateAndroidCertRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public CreateAndroidCertRequest setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }
    public String getKeyAlias() {
        return this.keyAlias;
    }

    public CreateAndroidCertRequest setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
        return this;
    }
    public String getKeyPassword() {
        return this.keyPassword;
    }

}
