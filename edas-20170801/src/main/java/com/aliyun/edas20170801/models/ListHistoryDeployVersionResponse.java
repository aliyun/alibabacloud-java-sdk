// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHistoryDeployVersionResponseBody body;

    public static ListHistoryDeployVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionResponse self = new ListHistoryDeployVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoryDeployVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHistoryDeployVersionResponse setBody(ListHistoryDeployVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoryDeployVersionResponseBody getBody() {
        return this.body;
    }

}
