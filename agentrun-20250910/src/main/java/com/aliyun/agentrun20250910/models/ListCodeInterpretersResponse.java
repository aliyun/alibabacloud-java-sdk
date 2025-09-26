// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCodeInterpretersResult body;

    public static ListCodeInterpretersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpretersResponse self = new ListCodeInterpretersResponse();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpretersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCodeInterpretersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCodeInterpretersResponse setBody(ListCodeInterpretersResult body) {
        this.body = body;
        return this;
    }
    public ListCodeInterpretersResult getBody() {
        return this.body;
    }

}
