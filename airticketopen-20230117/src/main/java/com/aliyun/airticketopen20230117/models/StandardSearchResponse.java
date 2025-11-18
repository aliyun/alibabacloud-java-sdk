// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StandardSearchResponseBody body;

    public static StandardSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        StandardSearchResponse self = new StandardSearchResponse();
        return TeaModel.build(map, self);
    }

    public StandardSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StandardSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StandardSearchResponse setBody(StandardSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public StandardSearchResponseBody getBody() {
        return this.body;
    }

}
