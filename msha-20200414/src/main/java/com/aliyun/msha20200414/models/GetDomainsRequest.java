// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainsRequest extends TeaModel {
    // 命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    public static GetDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainsRequest self = new GetDomainsRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainsRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

}
