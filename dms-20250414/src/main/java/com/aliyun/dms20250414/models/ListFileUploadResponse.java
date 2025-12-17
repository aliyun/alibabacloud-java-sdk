// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileUploadResponseBody body;

    public static ListFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileUploadResponse self = new ListFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public ListFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileUploadResponse setBody(ListFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileUploadResponseBody getBody() {
        return this.body;
    }

}
