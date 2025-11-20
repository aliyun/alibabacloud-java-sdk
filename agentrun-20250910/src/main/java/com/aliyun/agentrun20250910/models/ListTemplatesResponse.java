// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplatesResult body;

    public static ListTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponse self = new ListTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplatesResponse setBody(ListTemplatesResult body) {
        this.body = body;
        return this;
    }
    public ListTemplatesResult getBody() {
        return this.body;
    }

}
