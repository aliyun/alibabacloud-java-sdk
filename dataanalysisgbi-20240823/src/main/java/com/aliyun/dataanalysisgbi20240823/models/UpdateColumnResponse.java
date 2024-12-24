// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateColumnResponseBody body;

    public static UpdateColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnResponse self = new UpdateColumnResponse();
        return TeaModel.build(map, self);
    }

    public UpdateColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateColumnResponse setBody(UpdateColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateColumnResponseBody getBody() {
        return this.body;
    }

}
