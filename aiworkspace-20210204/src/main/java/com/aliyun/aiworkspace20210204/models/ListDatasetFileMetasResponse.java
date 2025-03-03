// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetFileMetasResponseBody body;

    public static ListDatasetFileMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetFileMetasResponse self = new ListDatasetFileMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetFileMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetFileMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetFileMetasResponse setBody(ListDatasetFileMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetFileMetasResponseBody getBody() {
        return this.body;
    }

}
