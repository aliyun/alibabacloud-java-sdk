// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CdnMigrateRegisterRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to register the dynamic routing feature. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static CdnMigrateRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        CdnMigrateRegisterRequest self = new CdnMigrateRegisterRequest();
        return TeaModel.build(map, self);
    }

    public CdnMigrateRegisterRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
