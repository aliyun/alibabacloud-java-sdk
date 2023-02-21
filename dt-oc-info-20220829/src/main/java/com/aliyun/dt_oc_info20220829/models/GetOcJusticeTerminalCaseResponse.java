// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeTerminalCaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeTerminalCaseResponseBody body;

    public static GetOcJusticeTerminalCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeTerminalCaseResponse self = new GetOcJusticeTerminalCaseResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeTerminalCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeTerminalCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeTerminalCaseResponse setBody(GetOcJusticeTerminalCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeTerminalCaseResponseBody getBody() {
        return this.body;
    }

}
