// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetTaxLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaxLevelResponseBody body;

    public static GetTaxLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaxLevelResponse self = new GetTaxLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetTaxLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaxLevelResponse setBody(GetTaxLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaxLevelResponseBody getBody() {
        return this.body;
    }

}
