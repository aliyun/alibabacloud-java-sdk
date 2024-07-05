// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteBindingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACDFE467-C817-4B36-951A-6EB5A592****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingResponseBody self = new DeleteBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
