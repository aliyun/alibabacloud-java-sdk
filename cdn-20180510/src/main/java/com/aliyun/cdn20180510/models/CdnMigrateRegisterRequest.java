// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CdnMigrateRegisterRequest extends TeaModel {
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
