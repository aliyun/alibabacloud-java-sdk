// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePrivateLineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7908F2FF-44F8-120F-9FD6-85AE4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePrivateLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePrivateLineResponseBody self = new DeleteLivePrivateLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePrivateLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
