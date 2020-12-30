// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SSLPub")
    public String SSLPub;

    public static DescribeCdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainByCertificateRequest self = new DescribeCdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainByCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnDomainByCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

}
