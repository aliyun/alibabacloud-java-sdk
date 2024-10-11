// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateFileNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileNameResponseBody body;

    public static UpdateFileNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileNameResponse self = new UpdateFileNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileNameResponse setBody(UpdateFileNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileNameResponseBody getBody() {
        return this.body;
    }

}
