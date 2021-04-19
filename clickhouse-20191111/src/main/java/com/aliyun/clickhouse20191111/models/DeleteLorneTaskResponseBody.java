// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteLorneTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLorneTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLorneTaskResponseBody self = new DeleteLorneTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLorneTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
