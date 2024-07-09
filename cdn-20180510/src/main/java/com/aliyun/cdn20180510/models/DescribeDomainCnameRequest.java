// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query. Separate multiple domain names with commas (,). This parameter cannot be left empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pay.slci6c.mbolsos.com,mch.b7r2v7.mbolsos.com,p.h99e.mbolsos.com,p.xmko.mbolsos.com,p.f2kd.mbolsos.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDomainCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCnameRequest self = new DescribeDomainCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCnameRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
