// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetRskMortgageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRskMortgageResponseBody body;

    public static GetRskMortgageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRskMortgageResponse self = new GetRskMortgageResponse();
        return TeaModel.build(map, self);
    }

    public GetRskMortgageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRskMortgageResponse setBody(GetRskMortgageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRskMortgageResponseBody getBody() {
        return this.body;
    }

}
