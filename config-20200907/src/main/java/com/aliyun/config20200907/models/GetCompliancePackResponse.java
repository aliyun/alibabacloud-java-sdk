// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompliancePackResponseBody body;

    public static GetCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackResponse self = new GetCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompliancePackResponse setBody(GetCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompliancePackResponseBody getBody() {
        return this.body;
    }

}
