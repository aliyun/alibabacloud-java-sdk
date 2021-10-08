// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlertListResponseBody body;

    public static GetAlertListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertListResponse self = new GetAlertListResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertListResponse setBody(GetAlertListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertListResponseBody getBody() {
        return this.body;
    }

}
