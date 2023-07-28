// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvNamespaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvNamespaceResponseBody self = new DeleteDcdnKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
