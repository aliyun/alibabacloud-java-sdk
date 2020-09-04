// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateIosCertRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("Credential")
    public String credential;

    @NameInMap("MobileProvisionList")
    public java.util.Map<String, ?> mobileProvisionList;

    public static UpdateIosCertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIosCertRequest self = new UpdateIosCertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIosCertRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateIosCertRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateIosCertRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateIosCertRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UpdateIosCertRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public UpdateIosCertRequest setMobileProvisionList(java.util.Map<String, ?> mobileProvisionList) {
        this.mobileProvisionList = mobileProvisionList;
        return this;
    }
    public java.util.Map<String, ?> getMobileProvisionList() {
        return this.mobileProvisionList;
    }

}
