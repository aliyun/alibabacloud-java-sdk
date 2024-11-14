// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107.models;

import com.aliyun.tea.*;

public class GetLabelTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLabelTaskResultResponseBody body;

    public static GetLabelTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTaskResultResponse self = new GetLabelTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelTaskResultResponse setBody(GetLabelTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelTaskResultResponseBody getBody() {
        return this.body;
    }

}
