// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateIosCertShrinkRequest extends TeaModel {
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
    public String mobileProvisionListShrink;

    public static UpdateIosCertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIosCertShrinkRequest self = new UpdateIosCertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIosCertShrinkRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateIosCertShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateIosCertShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateIosCertShrinkRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UpdateIosCertShrinkRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public UpdateIosCertShrinkRequest setMobileProvisionListShrink(String mobileProvisionListShrink) {
        this.mobileProvisionListShrink = mobileProvisionListShrink;
        return this;
    }
    public String getMobileProvisionListShrink() {
        return this.mobileProvisionListShrink;
    }

}
