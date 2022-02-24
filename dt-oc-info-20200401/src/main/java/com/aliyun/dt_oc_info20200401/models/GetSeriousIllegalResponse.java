// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetSeriousIllegalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSeriousIllegalResponseBody body;

    public static GetSeriousIllegalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSeriousIllegalResponse self = new GetSeriousIllegalResponse();
        return TeaModel.build(map, self);
    }

    public GetSeriousIllegalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSeriousIllegalResponse setBody(GetSeriousIllegalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSeriousIllegalResponseBody getBody() {
        return this.body;
    }

}
