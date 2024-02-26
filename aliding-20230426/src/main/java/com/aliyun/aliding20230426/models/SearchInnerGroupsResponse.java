// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchInnerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchInnerGroupsResponseBody body;

    public static SearchInnerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchInnerGroupsResponse self = new SearchInnerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public SearchInnerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchInnerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchInnerGroupsResponse setBody(SearchInnerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchInnerGroupsResponseBody getBody() {
        return this.body;
    }

}
