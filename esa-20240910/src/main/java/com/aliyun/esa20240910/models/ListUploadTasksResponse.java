// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUploadTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUploadTasksResponseBody body;

    public static ListUploadTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUploadTasksResponse self = new ListUploadTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListUploadTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUploadTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUploadTasksResponse setBody(ListUploadTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUploadTasksResponseBody getBody() {
        return this.body;
    }

}
