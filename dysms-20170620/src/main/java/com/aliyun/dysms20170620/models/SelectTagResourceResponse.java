// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SelectTagResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectTagResourceResponseBody body;

    public static SelectTagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectTagResourceResponse self = new SelectTagResourceResponse();
        return TeaModel.build(map, self);
    }

    public SelectTagResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectTagResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectTagResourceResponse setBody(SelectTagResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectTagResourceResponseBody getBody() {
        return this.body;
    }

}
