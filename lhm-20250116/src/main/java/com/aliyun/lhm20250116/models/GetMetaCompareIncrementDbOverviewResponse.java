// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaCompareIncrementDbOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaCompareIncrementDbOverviewResponseBody body;

    public static GetMetaCompareIncrementDbOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCompareIncrementDbOverviewResponse self = new GetMetaCompareIncrementDbOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaCompareIncrementDbOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaCompareIncrementDbOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaCompareIncrementDbOverviewResponse setBody(GetMetaCompareIncrementDbOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaCompareIncrementDbOverviewResponseBody getBody() {
        return this.body;
    }

}
