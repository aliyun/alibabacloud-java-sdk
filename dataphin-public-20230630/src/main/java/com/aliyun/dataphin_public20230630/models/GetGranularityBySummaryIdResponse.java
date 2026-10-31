// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetGranularityBySummaryIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGranularityBySummaryIdResponseBody body;

    public static GetGranularityBySummaryIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGranularityBySummaryIdResponse self = new GetGranularityBySummaryIdResponse();
        return TeaModel.build(map, self);
    }

    public GetGranularityBySummaryIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGranularityBySummaryIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGranularityBySummaryIdResponse setBody(GetGranularityBySummaryIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGranularityBySummaryIdResponseBody getBody() {
        return this.body;
    }

}
