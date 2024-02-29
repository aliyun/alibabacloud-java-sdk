// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpRiskDataResponseBody body;

    public static GetOpRiskDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataResponse self = new GetOpRiskDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpRiskDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpRiskDataResponse setBody(GetOpRiskDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpRiskDataResponseBody getBody() {
        return this.body;
    }

}
