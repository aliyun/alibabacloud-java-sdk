// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListBusinessLogicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBusinessLogicResponseBody body;

    public static ListBusinessLogicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessLogicResponse self = new ListBusinessLogicResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessLogicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessLogicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusinessLogicResponse setBody(ListBusinessLogicResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessLogicResponseBody getBody() {
        return this.body;
    }

}
