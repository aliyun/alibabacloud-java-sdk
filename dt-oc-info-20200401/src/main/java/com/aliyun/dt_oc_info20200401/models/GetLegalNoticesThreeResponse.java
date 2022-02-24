// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetLegalNoticesThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLegalNoticesThreeResponseBody body;

    public static GetLegalNoticesThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLegalNoticesThreeResponse self = new GetLegalNoticesThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetLegalNoticesThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLegalNoticesThreeResponse setBody(GetLegalNoticesThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLegalNoticesThreeResponseBody getBody() {
        return this.body;
    }

}
