// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetJudicialFreezesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJudicialFreezesResponseBody body;

    public static GetJudicialFreezesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJudicialFreezesResponse self = new GetJudicialFreezesResponse();
        return TeaModel.build(map, self);
    }

    public GetJudicialFreezesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJudicialFreezesResponse setBody(GetJudicialFreezesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJudicialFreezesResponseBody getBody() {
        return this.body;
    }

}
