// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenRealPersonVerificationTokenRequest extends TeaModel {
    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("CertificateNumber")
    public String certificateNumber;

    @NameInMap("MetaInfo")
    public String metaInfo;

    public static GenRealPersonVerificationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenRealPersonVerificationTokenRequest self = new GenRealPersonVerificationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenRealPersonVerificationTokenRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public GenRealPersonVerificationTokenRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public GenRealPersonVerificationTokenRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

}
