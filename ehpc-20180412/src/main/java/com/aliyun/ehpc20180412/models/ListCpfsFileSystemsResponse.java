// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCpfsFileSystemsResponseBody body;

    public static ListCpfsFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCpfsFileSystemsResponse self = new ListCpfsFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public ListCpfsFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCpfsFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCpfsFileSystemsResponse setBody(ListCpfsFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCpfsFileSystemsResponseBody getBody() {
        return this.body;
    }

}
