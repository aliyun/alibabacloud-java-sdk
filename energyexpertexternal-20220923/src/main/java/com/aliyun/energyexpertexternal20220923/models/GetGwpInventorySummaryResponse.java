// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpInventorySummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGwpInventorySummaryResponseBody body;

    public static GetGwpInventorySummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGwpInventorySummaryResponse self = new GetGwpInventorySummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetGwpInventorySummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGwpInventorySummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGwpInventorySummaryResponse setBody(GetGwpInventorySummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGwpInventorySummaryResponseBody getBody() {
        return this.body;
    }

}
