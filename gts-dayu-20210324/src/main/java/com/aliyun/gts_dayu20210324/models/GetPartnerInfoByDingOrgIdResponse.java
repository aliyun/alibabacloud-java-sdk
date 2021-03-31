// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class GetPartnerInfoByDingOrgIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPartnerInfoByDingOrgIdResponseBody body;

    public static GetPartnerInfoByDingOrgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerInfoByDingOrgIdResponse self = new GetPartnerInfoByDingOrgIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPartnerInfoByDingOrgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartnerInfoByDingOrgIdResponse setBody(GetPartnerInfoByDingOrgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartnerInfoByDingOrgIdResponseBody getBody() {
        return this.body;
    }

}
