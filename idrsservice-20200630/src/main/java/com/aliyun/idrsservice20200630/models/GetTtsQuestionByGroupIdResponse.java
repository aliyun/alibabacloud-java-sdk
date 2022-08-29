// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTtsQuestionByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTtsQuestionByGroupIdResponseBody body;

    public static GetTtsQuestionByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTtsQuestionByGroupIdResponse self = new GetTtsQuestionByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTtsQuestionByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTtsQuestionByGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTtsQuestionByGroupIdResponse setBody(GetTtsQuestionByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTtsQuestionByGroupIdResponseBody getBody() {
        return this.body;
    }

}
