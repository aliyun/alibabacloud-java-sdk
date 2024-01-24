// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDirectoriesAndFilesResponseBody body;

    public static ListDirectoriesAndFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesAndFilesResponse self = new ListDirectoriesAndFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesAndFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDirectoriesAndFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDirectoriesAndFilesResponse setBody(ListDirectoriesAndFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectoriesAndFilesResponseBody getBody() {
        return this.body;
    }

}
