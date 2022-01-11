// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryDomainTransferStatusRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static QueryDomainTransferStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainTransferStatusRequest self = new QueryDomainTransferStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainTransferStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
