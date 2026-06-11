// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceResponseBody self = new UpdateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
