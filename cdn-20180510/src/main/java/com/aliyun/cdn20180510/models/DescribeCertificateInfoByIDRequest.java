// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CertId")
    public String certId;

    public static DescribeCertificateInfoByIDRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateInfoByIDRequest self = new DescribeCertificateInfoByIDRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateInfoByIDRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCertificateInfoByIDRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

}
