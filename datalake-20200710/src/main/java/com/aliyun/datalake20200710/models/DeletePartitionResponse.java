// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePartitionResponseBody body;

    public static DeletePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionResponse self = new DeletePartitionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePartitionResponse setBody(DeletePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePartitionResponseBody getBody() {
        return this.body;
    }

}
