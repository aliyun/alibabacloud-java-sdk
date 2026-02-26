// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetPromptTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPromptTestResultResponseBody body;

    public static GetPromptTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPromptTestResultResponse self = new GetPromptTestResultResponse();
        return TeaModel.build(map, self);
    }

    public GetPromptTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPromptTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPromptTestResultResponse setBody(GetPromptTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPromptTestResultResponseBody getBody() {
        return this.body;
    }

}
