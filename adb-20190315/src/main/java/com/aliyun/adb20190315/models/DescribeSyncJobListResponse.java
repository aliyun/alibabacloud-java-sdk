// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncJobListResponseBody body;

    public static DescribeSyncJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncJobListResponse self = new DescribeSyncJobListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncJobListResponse setBody(DescribeSyncJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncJobListResponseBody getBody() {
        return this.body;
    }

}
