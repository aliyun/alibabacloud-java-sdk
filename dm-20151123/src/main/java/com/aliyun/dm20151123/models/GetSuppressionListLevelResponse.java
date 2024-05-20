// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSuppressionListLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuppressionListLevelResponseBody body;

    public static GetSuppressionListLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuppressionListLevelResponse self = new GetSuppressionListLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetSuppressionListLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuppressionListLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuppressionListLevelResponse setBody(GetSuppressionListLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuppressionListLevelResponseBody getBody() {
        return this.body;
    }

}
