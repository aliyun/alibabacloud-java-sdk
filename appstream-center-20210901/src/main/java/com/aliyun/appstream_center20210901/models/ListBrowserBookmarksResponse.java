// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserBookmarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBrowserBookmarksResponseBody body;

    public static ListBrowserBookmarksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserBookmarksResponse self = new ListBrowserBookmarksResponse();
        return TeaModel.build(map, self);
    }

    public ListBrowserBookmarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBrowserBookmarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBrowserBookmarksResponse setBody(ListBrowserBookmarksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBrowserBookmarksResponseBody getBody() {
        return this.body;
    }

}
