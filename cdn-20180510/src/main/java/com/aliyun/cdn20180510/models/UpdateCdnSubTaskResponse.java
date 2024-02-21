// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCdnSubTaskResponseBody body;

    public static UpdateCdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnSubTaskResponse self = new UpdateCdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCdnSubTaskResponse setBody(UpdateCdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
