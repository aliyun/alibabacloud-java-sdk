// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ConvertClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertClusterResponseBody body;

    public static ConvertClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertClusterResponse self = new ConvertClusterResponse();
        return TeaModel.build(map, self);
    }

    public ConvertClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertClusterResponse setBody(ConvertClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertClusterResponseBody getBody() {
        return this.body;
    }

}
