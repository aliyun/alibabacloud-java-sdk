// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepoBuildRecordStatusResponseBody body;

    public static GetRepoBuildRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusResponse self = new GetRepoBuildRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoBuildRecordStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoBuildRecordStatusResponse setBody(GetRepoBuildRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoBuildRecordStatusResponseBody getBody() {
        return this.body;
    }

}
