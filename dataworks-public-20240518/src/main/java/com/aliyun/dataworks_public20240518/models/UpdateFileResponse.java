// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileResponseBody body;

    public static UpdateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileResponse self = new UpdateFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileResponse setBody(UpdateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileResponseBody getBody() {
        return this.body;
    }

}
