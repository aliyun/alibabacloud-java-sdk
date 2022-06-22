// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuertInspectJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuertInspectJobListResponseBody body;

    public static QuertInspectJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuertInspectJobListResponse self = new QuertInspectJobListResponse();
        return TeaModel.build(map, self);
    }

    public QuertInspectJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuertInspectJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuertInspectJobListResponse setBody(QuertInspectJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuertInspectJobListResponseBody getBody() {
        return this.body;
    }

}
