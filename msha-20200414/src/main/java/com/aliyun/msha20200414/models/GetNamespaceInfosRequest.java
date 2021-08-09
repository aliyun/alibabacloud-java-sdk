// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetNamespaceInfosRequest extends TeaModel {
    // MSHA命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    public static GetNamespaceInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceInfosRequest self = new GetNamespaceInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetNamespaceInfosRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

}
