// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDcdnSubTaskResponseBody body;

    public static UpdateDcdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSubTaskResponse self = new UpdateDcdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnSubTaskResponse setBody(UpdateDcdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
