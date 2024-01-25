// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetGroupByDimensionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupByDimensionDataResponseBody body;

    public static GetGroupByDimensionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByDimensionDataResponse self = new GetGroupByDimensionDataResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupByDimensionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupByDimensionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupByDimensionDataResponse setBody(GetGroupByDimensionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupByDimensionDataResponseBody getBody() {
        return this.body;
    }

}
