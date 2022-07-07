// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDomainDnsTxtRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("Domain")
    public String domain;

    public static GetDomainDnsTxtRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainDnsTxtRequest self = new GetDomainDnsTxtRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainDnsTxtRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public GetDomainDnsTxtRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
