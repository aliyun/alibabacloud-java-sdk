// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectLabelsResponseBody body;

    public static ListProjectLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLabelsResponse self = new ListProjectLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectLabelsResponse setBody(ListProjectLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectLabelsResponseBody getBody() {
        return this.body;
    }

}
