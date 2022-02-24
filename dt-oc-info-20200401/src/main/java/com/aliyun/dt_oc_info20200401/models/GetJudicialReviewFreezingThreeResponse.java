// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetJudicialReviewFreezingThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJudicialReviewFreezingThreeResponseBody body;

    public static GetJudicialReviewFreezingThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJudicialReviewFreezingThreeResponse self = new GetJudicialReviewFreezingThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetJudicialReviewFreezingThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJudicialReviewFreezingThreeResponse setBody(GetJudicialReviewFreezingThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJudicialReviewFreezingThreeResponseBody getBody() {
        return this.body;
    }

}
