// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetNamespaceStatisticsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNamespaceStatisticsDataResponseBody body;

    public static GetNamespaceStatisticsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceStatisticsDataResponse self = new GetNamespaceStatisticsDataResponse();
        return TeaModel.build(map, self);
    }

    public GetNamespaceStatisticsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNamespaceStatisticsDataResponse setBody(GetNamespaceStatisticsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNamespaceStatisticsDataResponseBody getBody() {
        return this.body;
    }

}
