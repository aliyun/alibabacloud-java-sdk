// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class RefreshTaobaoItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshTaobaoItemResponseBody body;

    public static RefreshTaobaoItemResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshTaobaoItemResponse self = new RefreshTaobaoItemResponse();
        return TeaModel.build(map, self);
    }

    public RefreshTaobaoItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshTaobaoItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshTaobaoItemResponse setBody(RefreshTaobaoItemResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshTaobaoItemResponseBody getBody() {
        return this.body;
    }

}
