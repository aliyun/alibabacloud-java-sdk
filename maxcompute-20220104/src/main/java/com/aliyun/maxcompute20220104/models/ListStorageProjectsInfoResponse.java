// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageProjectsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStorageProjectsInfoResponseBody body;

    public static ListStorageProjectsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStorageProjectsInfoResponse self = new ListStorageProjectsInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListStorageProjectsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStorageProjectsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStorageProjectsInfoResponse setBody(ListStorageProjectsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStorageProjectsInfoResponseBody getBody() {
        return this.body;
    }

}
