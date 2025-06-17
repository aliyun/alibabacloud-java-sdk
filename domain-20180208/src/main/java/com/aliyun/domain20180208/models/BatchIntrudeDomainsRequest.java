// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchIntrudeDomainsRequest extends TeaModel {
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    public static BatchIntrudeDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIntrudeDomainsRequest self = new BatchIntrudeDomainsRequest();
        return TeaModel.build(map, self);
    }

    public BatchIntrudeDomainsRequest setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

}
