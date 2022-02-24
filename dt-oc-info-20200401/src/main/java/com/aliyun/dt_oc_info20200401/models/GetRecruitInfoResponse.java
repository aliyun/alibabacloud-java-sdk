// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetRecruitInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRecruitInfoResponseBody body;

    public static GetRecruitInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecruitInfoResponse self = new GetRecruitInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRecruitInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecruitInfoResponse setBody(GetRecruitInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecruitInfoResponseBody getBody() {
        return this.body;
    }

}
