// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateMapRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMapRunResponseBody body;

    public static UpdateMapRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMapRunResponse self = new UpdateMapRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMapRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMapRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMapRunResponse setBody(UpdateMapRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMapRunResponseBody getBody() {
        return this.body;
    }

}
