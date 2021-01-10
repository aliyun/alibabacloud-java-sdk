// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateNamespaceDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNamespaceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceDataResponseBody self = new UpdateNamespaceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
