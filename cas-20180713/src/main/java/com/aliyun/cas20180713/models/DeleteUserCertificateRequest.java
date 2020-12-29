// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DeleteUserCertificateRequest extends TeaModel {
    @NameInMap("CertId")
    public Long certId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DeleteUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCertificateRequest self = new DeleteUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DeleteUserCertificateRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteUserCertificateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
