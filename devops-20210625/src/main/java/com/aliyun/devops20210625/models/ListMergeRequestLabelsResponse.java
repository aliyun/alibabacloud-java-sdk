// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMergeRequestLabelsResponseBody body;

    public static ListMergeRequestLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestLabelsResponse self = new ListMergeRequestLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMergeRequestLabelsResponse setBody(ListMergeRequestLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestLabelsResponseBody getBody() {
        return this.body;
    }

}
