// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataIdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchFormDataIdListResponseBody body;

    public static SearchFormDataIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataIdListResponse self = new SearchFormDataIdListResponse();
        return TeaModel.build(map, self);
    }

    public SearchFormDataIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFormDataIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFormDataIdListResponse setBody(SearchFormDataIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFormDataIdListResponseBody getBody() {
        return this.body;
    }

}
