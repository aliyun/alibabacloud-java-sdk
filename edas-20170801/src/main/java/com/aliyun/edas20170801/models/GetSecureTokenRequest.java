// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static GetSecureTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecureTokenRequest self = new GetSecureTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetSecureTokenRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
