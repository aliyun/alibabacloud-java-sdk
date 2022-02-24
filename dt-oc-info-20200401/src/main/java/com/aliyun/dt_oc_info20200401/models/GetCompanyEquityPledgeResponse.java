// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyEquityPledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyEquityPledgeResponseBody body;

    public static GetCompanyEquityPledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyEquityPledgeResponse self = new GetCompanyEquityPledgeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyEquityPledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyEquityPledgeResponse setBody(GetCompanyEquityPledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyEquityPledgeResponseBody getBody() {
        return this.body;
    }

}
