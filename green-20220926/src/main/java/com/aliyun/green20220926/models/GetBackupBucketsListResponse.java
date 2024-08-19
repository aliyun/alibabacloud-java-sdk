// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupBucketsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupBucketsListResponseBody body;

    public static GetBackupBucketsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupBucketsListResponse self = new GetBackupBucketsListResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupBucketsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupBucketsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupBucketsListResponse setBody(GetBackupBucketsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupBucketsListResponseBody getBody() {
        return this.body;
    }

}
