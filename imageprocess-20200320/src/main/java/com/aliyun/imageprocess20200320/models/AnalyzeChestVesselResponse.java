// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class AnalyzeChestVesselResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AnalyzeChestVesselResponseBody body;

    public static AnalyzeChestVesselResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeChestVesselResponse self = new AnalyzeChestVesselResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeChestVesselResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeChestVesselResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeChestVesselResponse setBody(AnalyzeChestVesselResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeChestVesselResponseBody getBody() {
        return this.body;
    }

}
