// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetOverdueTaxsThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOverdueTaxsThreeResponseBody body;

    public static GetOverdueTaxsThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOverdueTaxsThreeResponse self = new GetOverdueTaxsThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetOverdueTaxsThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOverdueTaxsThreeResponse setBody(GetOverdueTaxsThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOverdueTaxsThreeResponseBody getBody() {
        return this.body;
    }

}
