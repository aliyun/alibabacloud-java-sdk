// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteDomainResourceRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    public static DeleteDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResourceRequest self = new DeleteDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
