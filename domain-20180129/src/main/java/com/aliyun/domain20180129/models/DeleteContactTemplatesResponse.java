// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContactTemplatesResponseBody body;

    public static DeleteContactTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesResponse self = new DeleteContactTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactTemplatesResponse setBody(DeleteContactTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactTemplatesResponseBody getBody() {
        return this.body;
    }

}
