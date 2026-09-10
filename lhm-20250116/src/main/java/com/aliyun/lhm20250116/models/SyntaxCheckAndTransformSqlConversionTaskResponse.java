// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SyntaxCheckAndTransformSqlConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyntaxCheckAndTransformSqlConversionTaskResponseBody body;

    public static SyntaxCheckAndTransformSqlConversionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SyntaxCheckAndTransformSqlConversionTaskResponse self = new SyntaxCheckAndTransformSqlConversionTaskResponse();
        return TeaModel.build(map, self);
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyntaxCheckAndTransformSqlConversionTaskResponse setBody(SyntaxCheckAndTransformSqlConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SyntaxCheckAndTransformSqlConversionTaskResponseBody getBody() {
        return this.body;
    }

}
