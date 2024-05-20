// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SetSuppressionListLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSuppressionListLevelResponseBody body;

    public static SetSuppressionListLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSuppressionListLevelResponse self = new SetSuppressionListLevelResponse();
        return TeaModel.build(map, self);
    }

    public SetSuppressionListLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSuppressionListLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSuppressionListLevelResponse setBody(SetSuppressionListLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSuppressionListLevelResponseBody getBody() {
        return this.body;
    }

}
