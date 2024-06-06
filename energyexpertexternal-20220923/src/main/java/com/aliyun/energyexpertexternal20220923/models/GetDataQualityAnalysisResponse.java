// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataQualityAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityAnalysisResponseBody body;

    public static GetDataQualityAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityAnalysisResponse self = new GetDataQualityAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityAnalysisResponse setBody(GetDataQualityAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityAnalysisResponseBody getBody() {
        return this.body;
    }

}
