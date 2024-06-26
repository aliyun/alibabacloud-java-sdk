// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePeerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePeerLogsResponseBody body;

    public static DescribePeerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePeerLogsResponse self = new DescribePeerLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePeerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePeerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePeerLogsResponse setBody(DescribePeerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePeerLogsResponseBody getBody() {
        return this.body;
    }

}
