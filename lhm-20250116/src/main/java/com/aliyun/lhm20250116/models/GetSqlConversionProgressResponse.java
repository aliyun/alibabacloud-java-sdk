// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlConversionProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlConversionProgressResponseBody body;

    public static GetSqlConversionProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConversionProgressResponse self = new GetSqlConversionProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlConversionProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlConversionProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlConversionProgressResponse setBody(GetSqlConversionProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConversionProgressResponseBody getBody() {
        return this.body;
    }

}
