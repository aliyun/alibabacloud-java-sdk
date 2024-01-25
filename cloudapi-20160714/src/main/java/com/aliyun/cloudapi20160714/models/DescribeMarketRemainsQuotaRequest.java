// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeMarketRemainsQuotaRequest extends TeaModel {
    /**
     * <p>The custom domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeMarketRemainsQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarketRemainsQuotaRequest self = new DescribeMarketRemainsQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMarketRemainsQuotaRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeMarketRemainsQuotaRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
