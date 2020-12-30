// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserVipsByDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Available")
    public String available;

    public static DescribeUserVipsByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVipsByDomainRequest self = new DescribeUserVipsByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserVipsByDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserVipsByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeUserVipsByDomainRequest setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

}
