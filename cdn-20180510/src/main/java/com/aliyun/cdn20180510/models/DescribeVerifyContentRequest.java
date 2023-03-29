// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentRequest extends TeaModel {
    /**
     * <p>The domain name of which you want to verify the ownership. You can specify only one domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

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

}
