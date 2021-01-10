// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMcuJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcuJobResponseBody body;

    public static DeleteMcuJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcuJobResponse self = new DeleteMcuJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcuJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcuJobResponse setBody(DeleteMcuJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcuJobResponseBody getBody() {
        return this.body;
    }

}
