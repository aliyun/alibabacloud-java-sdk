// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryCloseoutDomainInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static QueryCloseoutDomainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloseoutDomainInfoRequest self = new QueryCloseoutDomainInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloseoutDomainInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
