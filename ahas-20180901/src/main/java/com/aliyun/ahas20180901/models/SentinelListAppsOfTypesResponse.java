// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListAppsOfTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelListAppsOfTypesResponseBody body;

    public static SentinelListAppsOfTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelListAppsOfTypesResponse self = new SentinelListAppsOfTypesResponse();
        return TeaModel.build(map, self);
    }

    public SentinelListAppsOfTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelListAppsOfTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelListAppsOfTypesResponse setBody(SentinelListAppsOfTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelListAppsOfTypesResponseBody getBody() {
        return this.body;
    }

}
