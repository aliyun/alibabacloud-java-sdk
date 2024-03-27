// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobAnalyzeResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStructSyncJobAnalyzeResultResponseBody body;

    public static GetStructSyncJobAnalyzeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobAnalyzeResultResponse self = new GetStructSyncJobAnalyzeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobAnalyzeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStructSyncJobAnalyzeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStructSyncJobAnalyzeResultResponse setBody(GetStructSyncJobAnalyzeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncJobAnalyzeResultResponseBody getBody() {
        return this.body;
    }

}
