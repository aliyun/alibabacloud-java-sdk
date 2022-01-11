// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBookingDomainInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static QueryBookingDomainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBookingDomainInfoRequest self = new QueryBookingDomainInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryBookingDomainInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
