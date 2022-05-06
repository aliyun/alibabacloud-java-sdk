// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DeleteLabReservedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLabReservedResponseBody body;

    public static DeleteLabReservedResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabReservedResponse self = new DeleteLabReservedResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLabReservedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLabReservedResponse setBody(DeleteLabReservedResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLabReservedResponseBody getBody() {
        return this.body;
    }

}
