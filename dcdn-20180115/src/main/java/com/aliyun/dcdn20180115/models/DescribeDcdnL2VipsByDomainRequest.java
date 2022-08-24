// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsByDomainRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnL2VipsByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsByDomainRequest self = new DescribeDcdnL2VipsByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnL2VipsByDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
