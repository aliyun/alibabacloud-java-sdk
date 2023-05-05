// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributeAppResponseBody body;

    public static ListDistributeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAppResponse self = new ListDistributeAppResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributeAppResponse setBody(ListDistributeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributeAppResponseBody getBody() {
        return this.body;
    }

}
