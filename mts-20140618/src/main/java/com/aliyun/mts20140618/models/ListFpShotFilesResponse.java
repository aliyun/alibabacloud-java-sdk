// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFpShotFilesResponseBody body;

    public static ListFpShotFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotFilesResponse self = new ListFpShotFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFpShotFilesResponse setBody(ListFpShotFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotFilesResponseBody getBody() {
        return this.body;
    }

}
