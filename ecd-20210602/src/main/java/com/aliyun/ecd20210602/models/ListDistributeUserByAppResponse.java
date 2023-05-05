// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeUserByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributeUserByAppResponseBody body;

    public static ListDistributeUserByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeUserByAppResponse self = new ListDistributeUserByAppResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributeUserByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributeUserByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributeUserByAppResponse setBody(ListDistributeUserByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributeUserByAppResponseBody getBody() {
        return this.body;
    }

}
