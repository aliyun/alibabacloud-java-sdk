// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDetectionStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectionStatisticResponseBody body;

    public static GetDetectionStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionStatisticResponse self = new GetDetectionStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectionStatisticResponse setBody(GetDetectionStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionStatisticResponseBody getBody() {
        return this.body;
    }

}
