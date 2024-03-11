// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetItemPubChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetItemPubChEcomResponseBody body;

    public static GetItemPubChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemPubChEcomResponse self = new GetItemPubChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetItemPubChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemPubChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetItemPubChEcomResponse setBody(GetItemPubChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemPubChEcomResponseBody getBody() {
        return this.body;
    }

}
