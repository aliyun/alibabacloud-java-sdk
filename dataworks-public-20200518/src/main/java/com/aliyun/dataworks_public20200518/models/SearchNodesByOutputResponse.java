// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchNodesByOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchNodesByOutputResponseBody body;

    public static SearchNodesByOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchNodesByOutputResponse self = new SearchNodesByOutputResponse();
        return TeaModel.build(map, self);
    }

    public SearchNodesByOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchNodesByOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchNodesByOutputResponse setBody(SearchNodesByOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchNodesByOutputResponseBody getBody() {
        return this.body;
    }

}
