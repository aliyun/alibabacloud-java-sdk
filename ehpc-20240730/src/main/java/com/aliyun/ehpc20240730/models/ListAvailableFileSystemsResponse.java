// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableFileSystemsResponseBody body;

    public static ListAvailableFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableFileSystemsResponse self = new ListAvailableFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableFileSystemsResponse setBody(ListAvailableFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableFileSystemsResponseBody getBody() {
        return this.body;
    }

}
