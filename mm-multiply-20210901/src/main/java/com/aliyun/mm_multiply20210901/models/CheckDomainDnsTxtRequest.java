// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckDomainDnsTxtRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    // 域名
    @NameInMap("Domain")
    public String domain;

    public static CheckDomainDnsTxtRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainDnsTxtRequest self = new CheckDomainDnsTxtRequest();
        return TeaModel.build(map, self);
    }

    public CheckDomainDnsTxtRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CheckDomainDnsTxtRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
