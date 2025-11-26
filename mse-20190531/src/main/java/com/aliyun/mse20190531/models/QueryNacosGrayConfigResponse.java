// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNacosGrayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryNacosGrayConfigResponseBody body;

    public static QueryNacosGrayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNacosGrayConfigResponse self = new QueryNacosGrayConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryNacosGrayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNacosGrayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNacosGrayConfigResponse setBody(QueryNacosGrayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNacosGrayConfigResponseBody getBody() {
        return this.body;
    }

}
