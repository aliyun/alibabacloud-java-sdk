// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoLabelClassificationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoLabelClassificationResultResponseBody body;

    public static GetVideoLabelClassificationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoLabelClassificationResultResponse self = new GetVideoLabelClassificationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoLabelClassificationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoLabelClassificationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoLabelClassificationResultResponse setBody(GetVideoLabelClassificationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoLabelClassificationResultResponseBody getBody() {
        return this.body;
    }

}
