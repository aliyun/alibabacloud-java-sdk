// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDataInsightDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataInsightDirectoriesResponseBody body;

    public static ListDataInsightDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataInsightDirectoriesResponse self = new ListDataInsightDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataInsightDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataInsightDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataInsightDirectoriesResponse setBody(ListDataInsightDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataInsightDirectoriesResponseBody getBody() {
        return this.body;
    }

}
