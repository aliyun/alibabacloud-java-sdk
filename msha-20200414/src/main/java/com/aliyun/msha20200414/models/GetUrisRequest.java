// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUrisRequest extends TeaModel {
    // 域名Id
    @NameInMap("DomainId")
    public Long domainId;

    public static GetUrisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrisRequest self = new GetUrisRequest();
        return TeaModel.build(map, self);
    }

    public GetUrisRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

}
