// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetBeneficialInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBeneficialInfoResponseBody body;

    public static GetBeneficialInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBeneficialInfoResponse self = new GetBeneficialInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBeneficialInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBeneficialInfoResponse setBody(GetBeneficialInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBeneficialInfoResponseBody getBody() {
        return this.body;
    }

}
