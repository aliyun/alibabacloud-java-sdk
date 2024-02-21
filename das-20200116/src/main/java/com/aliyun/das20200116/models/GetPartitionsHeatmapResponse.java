// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPartitionsHeatmapResponseBody body;

    public static GetPartitionsHeatmapResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsHeatmapResponse self = new GetPartitionsHeatmapResponse();
        return TeaModel.build(map, self);
    }

    public GetPartitionsHeatmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartitionsHeatmapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPartitionsHeatmapResponse setBody(GetPartitionsHeatmapResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartitionsHeatmapResponseBody getBody() {
        return this.body;
    }

}
