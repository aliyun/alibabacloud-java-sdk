// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class GetMainDomainRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    public static GetMainDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainRequest self = new GetMainDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetMainDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
