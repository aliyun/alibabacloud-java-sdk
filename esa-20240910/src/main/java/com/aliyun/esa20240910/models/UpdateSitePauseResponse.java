// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSitePauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSitePauseResponseBody body;

    public static UpdateSitePauseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSitePauseResponse self = new UpdateSitePauseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSitePauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSitePauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSitePauseResponse setBody(UpdateSitePauseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSitePauseResponseBody getBody() {
        return this.body;
    }

}
