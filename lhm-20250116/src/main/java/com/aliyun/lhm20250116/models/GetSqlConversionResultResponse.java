// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlConversionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlConversionResultResponseBody body;

    public static GetSqlConversionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConversionResultResponse self = new GetSqlConversionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlConversionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlConversionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlConversionResultResponse setBody(GetSqlConversionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConversionResultResponseBody getBody() {
        return this.body;
    }

}
