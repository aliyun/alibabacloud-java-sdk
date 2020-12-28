// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetVisualServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetVisualServiceStatusResponse setBody(GetVisualServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVisualServiceStatusResponseBody getBody() {
        return this.body;
    }

}
