// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyProfileCallbackResponseBody body;

    public static GetCompanyProfileCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileCallbackResponse self = new GetCompanyProfileCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyProfileCallbackResponse setBody(GetCompanyProfileCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyProfileCallbackResponseBody getBody() {
        return this.body;
    }

}
