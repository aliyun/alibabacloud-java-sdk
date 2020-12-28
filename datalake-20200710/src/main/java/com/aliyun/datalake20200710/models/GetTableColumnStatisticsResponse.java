// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableColumnStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableColumnStatisticsResponseBody body;

    public static GetTableColumnStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnStatisticsResponse self = new GetTableColumnStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnStatisticsResponse setBody(GetTableColumnStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

}
