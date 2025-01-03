// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentResultDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentResultDataResponseBody body;

    public static GetExperimentResultDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResultDataResponse self = new GetExperimentResultDataResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentResultDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentResultDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentResultDataResponse setBody(GetExperimentResultDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentResultDataResponseBody getBody() {
        return this.body;
    }

}
