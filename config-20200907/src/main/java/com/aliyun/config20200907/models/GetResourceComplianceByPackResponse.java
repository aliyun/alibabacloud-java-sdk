// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceComplianceByPackResponseBody body;

    public static GetResourceComplianceByPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByPackResponse self = new GetResourceComplianceByPackResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceComplianceByPackResponse setBody(GetResourceComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
