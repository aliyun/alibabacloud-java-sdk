// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateIosCertShrinkRequest extends TeaModel {
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

    @NameInMap("MobileProvisionList")
    @Validation(required = true)
    public String mobileProvisionListShrink;

    public static CreateIosCertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIosCertShrinkRequest self = new CreateIosCertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIosCertShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateIosCertShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateIosCertShrinkRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateIosCertShrinkRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public CreateIosCertShrinkRequest setMobileProvisionListShrink(String mobileProvisionListShrink) {
        this.mobileProvisionListShrink = mobileProvisionListShrink;
        return this;
    }
    public String getMobileProvisionListShrink() {
        return this.mobileProvisionListShrink;
    }

}
