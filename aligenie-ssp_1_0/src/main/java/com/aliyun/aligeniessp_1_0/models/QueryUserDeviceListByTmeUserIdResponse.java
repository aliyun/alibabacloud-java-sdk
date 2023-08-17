// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryUserDeviceListByTmeUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserDeviceListByTmeUserIdResponseBody body;

    public static QueryUserDeviceListByTmeUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDeviceListByTmeUserIdResponse self = new QueryUserDeviceListByTmeUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserDeviceListByTmeUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserDeviceListByTmeUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserDeviceListByTmeUserIdResponse setBody(QueryUserDeviceListByTmeUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserDeviceListByTmeUserIdResponseBody getBody() {
        return this.body;
    }

}
