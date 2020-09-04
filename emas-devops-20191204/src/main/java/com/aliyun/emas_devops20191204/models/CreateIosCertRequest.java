// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateIosCertRequest extends TeaModel {
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
    public java.util.Map<String, ?> mobileProvisionList;

    public static CreateIosCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIosCertRequest self = new CreateIosCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateIosCertRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateIosCertRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateIosCertRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateIosCertRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public CreateIosCertRequest setMobileProvisionList(java.util.Map<String, ?> mobileProvisionList) {
        this.mobileProvisionList = mobileProvisionList;
        return this;
    }
    public java.util.Map<String, ?> getMobileProvisionList() {
        return this.mobileProvisionList;
    }

}
