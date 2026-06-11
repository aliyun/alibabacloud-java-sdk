// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DeleteNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceResponseBody self = new DeleteNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
