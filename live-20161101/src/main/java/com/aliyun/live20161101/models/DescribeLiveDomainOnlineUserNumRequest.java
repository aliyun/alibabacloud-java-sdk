// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainOnlineUserNumRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("QueryTime")
    public String queryTime;

    public static DescribeLiveDomainOnlineUserNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainOnlineUserNumRequest self = new DescribeLiveDomainOnlineUserNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainOnlineUserNumRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainOnlineUserNumRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainOnlineUserNumRequest setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

}
