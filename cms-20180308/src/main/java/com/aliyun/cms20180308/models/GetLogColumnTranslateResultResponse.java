// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLogColumnTranslateResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogColumnTranslateResultResponseBody body;

    public static GetLogColumnTranslateResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogColumnTranslateResultResponse self = new GetLogColumnTranslateResultResponse();
        return TeaModel.build(map, self);
    }

    public GetLogColumnTranslateResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogColumnTranslateResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogColumnTranslateResultResponse setBody(GetLogColumnTranslateResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogColumnTranslateResultResponseBody getBody() {
        return this.body;
    }

}
