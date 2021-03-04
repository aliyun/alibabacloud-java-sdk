// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    public static DescribeCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateRequest self = new DescribeCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

}
