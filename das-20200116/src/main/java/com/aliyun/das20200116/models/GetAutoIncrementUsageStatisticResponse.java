// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoIncrementUsageStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoIncrementUsageStatisticResponseBody body;

    public static GetAutoIncrementUsageStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoIncrementUsageStatisticResponse self = new GetAutoIncrementUsageStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoIncrementUsageStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoIncrementUsageStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoIncrementUsageStatisticResponse setBody(GetAutoIncrementUsageStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoIncrementUsageStatisticResponseBody getBody() {
        return this.body;
    }

}
