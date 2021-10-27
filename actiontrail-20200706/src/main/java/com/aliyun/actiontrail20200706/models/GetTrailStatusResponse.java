// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetTrailStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrailStatusResponseBody body;

    public static GetTrailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusResponse self = new GetTrailStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrailStatusResponse setBody(GetTrailStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrailStatusResponseBody getBody() {
        return this.body;
    }

}
