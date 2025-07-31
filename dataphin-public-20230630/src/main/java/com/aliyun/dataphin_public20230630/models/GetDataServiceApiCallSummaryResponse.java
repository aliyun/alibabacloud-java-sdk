// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiCallSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiCallSummaryResponseBody body;

    public static GetDataServiceApiCallSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiCallSummaryResponse self = new GetDataServiceApiCallSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiCallSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiCallSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiCallSummaryResponse setBody(GetDataServiceApiCallSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiCallSummaryResponseBody getBody() {
        return this.body;
    }

}
