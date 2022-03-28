// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserCertificateExpireCountRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnUserCertificateExpireCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserCertificateExpireCountRequest self = new DescribeDcdnUserCertificateExpireCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserCertificateExpireCountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
