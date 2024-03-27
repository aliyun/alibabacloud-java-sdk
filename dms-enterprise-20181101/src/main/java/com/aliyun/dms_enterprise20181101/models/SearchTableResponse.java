// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTableResponseBody body;

    public static SearchTableResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTableResponse self = new SearchTableResponse();
        return TeaModel.build(map, self);
    }

    public SearchTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTableResponse setBody(SearchTableResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTableResponseBody getBody() {
        return this.body;
    }

}
