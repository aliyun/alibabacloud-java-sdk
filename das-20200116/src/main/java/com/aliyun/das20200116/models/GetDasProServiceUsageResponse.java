// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasProServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDasProServiceUsageResponseBody body;

    public static GetDasProServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasProServiceUsageResponse self = new GetDasProServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetDasProServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDasProServiceUsageResponse setBody(GetDasProServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDasProServiceUsageResponseBody getBody() {
        return this.body;
    }

}
