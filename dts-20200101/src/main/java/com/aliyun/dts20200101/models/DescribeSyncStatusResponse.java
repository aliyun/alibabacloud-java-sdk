// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSyncStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncStatusResponseBody body;

    public static DescribeSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncStatusResponse self = new DescribeSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncStatusResponse setBody(DescribeSyncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncStatusResponseBody getBody() {
        return this.body;
    }

}
