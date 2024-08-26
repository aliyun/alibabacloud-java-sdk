// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchIndexJobRerunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchIndexJobRerunResponseBody body;

    public static SearchIndexJobRerunResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchIndexJobRerunResponse self = new SearchIndexJobRerunResponse();
        return TeaModel.build(map, self);
    }

    public SearchIndexJobRerunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchIndexJobRerunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchIndexJobRerunResponse setBody(SearchIndexJobRerunResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchIndexJobRerunResponseBody getBody() {
        return this.body;
    }

}
