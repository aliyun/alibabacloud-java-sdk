// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListLibraryInstallTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLibraryInstallTasksResponseBody body;

    public static ListLibraryInstallTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryInstallTasksResponse self = new ListLibraryInstallTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListLibraryInstallTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLibraryInstallTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLibraryInstallTasksResponse setBody(ListLibraryInstallTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLibraryInstallTasksResponseBody getBody() {
        return this.body;
    }

}
