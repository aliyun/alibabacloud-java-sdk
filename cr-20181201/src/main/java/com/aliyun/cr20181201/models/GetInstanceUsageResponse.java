// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceUsageResponseBody body;

    public static GetInstanceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUsageResponse self = new GetInstanceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceUsageResponse setBody(GetInstanceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceUsageResponseBody getBody() {
        return this.body;
    }

}
