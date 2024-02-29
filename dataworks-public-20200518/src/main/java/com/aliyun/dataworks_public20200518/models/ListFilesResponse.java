// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFilesResponseBody body;

    public static ListFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilesResponse self = new ListFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFilesResponse setBody(ListFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFilesResponseBody getBody() {
        return this.body;
    }

}
