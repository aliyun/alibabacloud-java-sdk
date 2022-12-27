// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentRequest extends TeaModel {
    // The domain name of which the ownership was verified. You can specify only one domain name.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentRequest self = new DescribeVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVerifyContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
