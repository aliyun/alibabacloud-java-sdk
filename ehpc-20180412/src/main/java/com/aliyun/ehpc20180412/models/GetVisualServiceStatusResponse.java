// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetVisualServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVisualServiceStatusResponseBody body;

    public static GetVisualServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVisualServiceStatusResponse self = new GetVisualServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVisualServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVisualServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVisualServiceStatusResponse setBody(GetVisualServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVisualServiceStatusResponseBody getBody() {
        return this.body;
    }

}
