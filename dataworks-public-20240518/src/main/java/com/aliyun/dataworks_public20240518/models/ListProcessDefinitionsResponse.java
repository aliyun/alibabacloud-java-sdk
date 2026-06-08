// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProcessDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProcessDefinitionsResponseBody body;

    public static ListProcessDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProcessDefinitionsResponse self = new ListProcessDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProcessDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProcessDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProcessDefinitionsResponse setBody(ListProcessDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProcessDefinitionsResponseBody getBody() {
        return this.body;
    }

}
