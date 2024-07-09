// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. You can query only one certificate in each call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1644xx</p>
     */
    @NameInMap("CertId")
    public String certId;

    public static DescribeCertificateInfoByIDRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateInfoByIDRequest self = new DescribeCertificateInfoByIDRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateInfoByIDRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

}
