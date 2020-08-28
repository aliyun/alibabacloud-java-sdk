// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class VerifyCertRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public Long appKey;

    @NameInMap("CertMode")
    @Validation(required = true)
    public String certMode;

    @NameInMap("EncodedCert")
    @Validation(required = true)
    public String encodedCert;

    @NameInMap("Password")
    @Validation(required = true)
    public String password;

    @NameInMap("BundleId")
    @Validation(required = true)
    public String bundleId;

    @NameInMap("IsCommit")
    @Validation(required = true)
    public Boolean isCommit;

    public static VerifyCertRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCertRequest self = new VerifyCertRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCertRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public VerifyCertRequest setCertMode(String certMode) {
        this.certMode = certMode;
        return this;
    }
    public String getCertMode() {
        return this.certMode;
    }

    public VerifyCertRequest setEncodedCert(String encodedCert) {
        this.encodedCert = encodedCert;
        return this;
    }
    public String getEncodedCert() {
        return this.encodedCert;
    }

    public VerifyCertRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public VerifyCertRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public VerifyCertRequest setIsCommit(Boolean isCommit) {
        this.isCommit = isCommit;
        return this;
    }
    public Boolean getIsCommit() {
        return this.isCommit;
    }

}
