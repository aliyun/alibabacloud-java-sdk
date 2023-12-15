// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmIssueOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmIssueOrderResponseBody body;

    public static TaobaoFilmIssueOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmIssueOrderResponse self = new TaobaoFilmIssueOrderResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmIssueOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmIssueOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmIssueOrderResponse setBody(TaobaoFilmIssueOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmIssueOrderResponseBody getBody() {
        return this.body;
    }

}
