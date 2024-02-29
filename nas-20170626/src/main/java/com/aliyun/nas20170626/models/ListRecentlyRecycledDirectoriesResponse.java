// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecentlyRecycledDirectoriesResponseBody body;

    public static ListRecentlyRecycledDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentlyRecycledDirectoriesResponse self = new ListRecentlyRecycledDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentlyRecycledDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentlyRecycledDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecentlyRecycledDirectoriesResponse setBody(ListRecentlyRecycledDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentlyRecycledDirectoriesResponseBody getBody() {
        return this.body;
    }

}
