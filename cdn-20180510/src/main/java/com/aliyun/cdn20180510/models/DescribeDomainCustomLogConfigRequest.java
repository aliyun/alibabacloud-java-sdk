// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCustomLogConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDomainCustomLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCustomLogConfigRequest self = new DescribeDomainCustomLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCustomLogConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
