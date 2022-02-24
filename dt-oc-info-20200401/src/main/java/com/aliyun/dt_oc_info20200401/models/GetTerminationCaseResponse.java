// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetTerminationCaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTerminationCaseResponseBody body;

    public static GetTerminationCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTerminationCaseResponse self = new GetTerminationCaseResponse();
        return TeaModel.build(map, self);
    }

    public GetTerminationCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTerminationCaseResponse setBody(GetTerminationCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTerminationCaseResponseBody getBody() {
        return this.body;
    }

}
