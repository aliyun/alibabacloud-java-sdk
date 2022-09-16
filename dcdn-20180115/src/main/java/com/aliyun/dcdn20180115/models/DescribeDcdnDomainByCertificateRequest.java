// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainByCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeDcdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainByCertificateRequest self = new DescribeDcdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainByCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnDomainByCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public DescribeDcdnDomainByCertificateRequest setSSLStatus(Boolean SSLStatus) {
        this.SSLStatus = SSLStatus;
        return this;
    }
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

}
