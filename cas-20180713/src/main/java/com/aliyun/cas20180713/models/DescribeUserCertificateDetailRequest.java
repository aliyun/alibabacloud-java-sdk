// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateDetailRequest extends TeaModel {
    @NameInMap("CertId")
    public Long certId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DescribeUserCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateDetailRequest self = new DescribeUserCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateDetailRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeUserCertificateDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserCertificateDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
