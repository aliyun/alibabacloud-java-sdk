// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteItemBySkuIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteItemBySkuIdResponseBody body;

    public static DeleteItemBySkuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemBySkuIdResponse self = new DeleteItemBySkuIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteItemBySkuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteItemBySkuIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteItemBySkuIdResponse setBody(DeleteItemBySkuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteItemBySkuIdResponseBody getBody() {
        return this.body;
    }

}
