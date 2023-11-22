// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowPreviewUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFlowPreviewUrlResponseBody body;

    public static GetFlowPreviewUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowPreviewUrlResponse self = new GetFlowPreviewUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowPreviewUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowPreviewUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowPreviewUrlResponse setBody(GetFlowPreviewUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowPreviewUrlResponseBody getBody() {
        return this.body;
    }

}
