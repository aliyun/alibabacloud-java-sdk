// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBaselineStatusResponseBody body;

    public static GetBaselineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusResponse self = new GetBaselineStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaselineStatusResponse setBody(GetBaselineStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaselineStatusResponseBody getBody() {
        return this.body;
    }

}
