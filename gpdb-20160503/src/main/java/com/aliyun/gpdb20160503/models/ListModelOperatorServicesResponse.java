// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelOperatorServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelOperatorServicesResponseBody body;

    public static ListModelOperatorServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelOperatorServicesResponse self = new ListModelOperatorServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelOperatorServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelOperatorServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelOperatorServicesResponse setBody(ListModelOperatorServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelOperatorServicesResponseBody getBody() {
        return this.body;
    }

}
