// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteVideoTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoTaskResponseBody self = new DeleteVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
