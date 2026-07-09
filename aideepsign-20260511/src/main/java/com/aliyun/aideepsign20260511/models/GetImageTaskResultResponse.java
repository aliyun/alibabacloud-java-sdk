// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageTaskResultResponseBody body;

    public static GetImageTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageTaskResultResponse self = new GetImageTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageTaskResultResponse setBody(GetImageTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageTaskResultResponseBody getBody() {
        return this.body;
    }

}
