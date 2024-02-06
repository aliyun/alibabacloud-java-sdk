// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssUsageDataResponseBody body;

    public static GetOssUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUsageDataResponse self = new GetOssUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUsageDataResponse setBody(GetOssUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUsageDataResponseBody getBody() {
        return this.body;
    }

}
