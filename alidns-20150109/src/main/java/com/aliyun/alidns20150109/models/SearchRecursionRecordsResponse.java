// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchRecursionRecordsResponseBody body;

    public static SearchRecursionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionRecordsResponse self = new SearchRecursionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public SearchRecursionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchRecursionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchRecursionRecordsResponse setBody(SearchRecursionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchRecursionRecordsResponseBody getBody() {
        return this.body;
    }

}
