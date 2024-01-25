// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTargetDimensionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTargetDimensionDataResponseBody body;

    public static GetTargetDimensionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTargetDimensionDataResponse self = new GetTargetDimensionDataResponse();
        return TeaModel.build(map, self);
    }

    public GetTargetDimensionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTargetDimensionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTargetDimensionDataResponse setBody(GetTargetDimensionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTargetDimensionDataResponseBody getBody() {
        return this.body;
    }

}
