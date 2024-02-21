// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMAliyunResourceSyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHDMAliyunResourceSyncResultResponseBody body;

    public static GetHDMAliyunResourceSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHDMAliyunResourceSyncResultResponse self = new GetHDMAliyunResourceSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHDMAliyunResourceSyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHDMAliyunResourceSyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHDMAliyunResourceSyncResultResponse setBody(GetHDMAliyunResourceSyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHDMAliyunResourceSyncResultResponseBody getBody() {
        return this.body;
    }

}
