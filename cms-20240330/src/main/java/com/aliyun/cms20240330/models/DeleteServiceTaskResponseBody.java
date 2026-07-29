// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTaskResponseBody self = new DeleteServiceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
