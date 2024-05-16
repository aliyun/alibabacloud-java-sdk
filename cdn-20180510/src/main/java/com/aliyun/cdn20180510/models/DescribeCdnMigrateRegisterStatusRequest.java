// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnMigrateRegisterStatusRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeCdnMigrateRegisterStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnMigrateRegisterStatusRequest self = new DescribeCdnMigrateRegisterStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnMigrateRegisterStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
