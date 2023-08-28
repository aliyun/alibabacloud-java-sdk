// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static UpdateTodoTaskExecutorStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusResponseBody self = new UpdateTodoTaskExecutorStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTodoTaskExecutorStatusResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
