// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class DeleteListenerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C6E3548-086F-5FF6-A2B3-B1871B3AB488</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteListenerResponseBody self = new DeleteListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
