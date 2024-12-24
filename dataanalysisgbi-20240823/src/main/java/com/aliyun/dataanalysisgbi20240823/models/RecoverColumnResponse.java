// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RecoverColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverColumnResponseBody body;

    public static RecoverColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverColumnResponse self = new RecoverColumnResponse();
        return TeaModel.build(map, self);
    }

    public RecoverColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverColumnResponse setBody(RecoverColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverColumnResponseBody getBody() {
        return this.body;
    }

}
