// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkitemsResponseBody body;

    public static ListWorkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemsResponse self = new ListWorkitemsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkitemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkitemsResponse setBody(ListWorkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkitemsResponseBody getBody() {
        return this.body;
    }

}
