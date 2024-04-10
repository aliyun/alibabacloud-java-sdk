// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepoTagScanStatusResponseBody body;

    public static GetRepoTagScanStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanStatusResponse self = new GetRepoTagScanStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoTagScanStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoTagScanStatusResponse setBody(GetRepoTagScanStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagScanStatusResponseBody getBody() {
        return this.body;
    }

}
