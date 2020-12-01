// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteLorneTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLorneTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLorneTaskResponse self = new DeleteLorneTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLorneTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
