// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskInAllResponseBody body;

    public static GetRiskInAllResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInAllResponse self = new GetRiskInAllResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskInAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskInAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskInAllResponse setBody(GetRiskInAllResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskInAllResponseBody getBody() {
        return this.body;
    }

}
