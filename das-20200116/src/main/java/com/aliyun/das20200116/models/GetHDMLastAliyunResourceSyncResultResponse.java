// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMLastAliyunResourceSyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHDMLastAliyunResourceSyncResultResponseBody body;

    public static GetHDMLastAliyunResourceSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHDMLastAliyunResourceSyncResultResponse self = new GetHDMLastAliyunResourceSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHDMLastAliyunResourceSyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setBody(GetHDMLastAliyunResourceSyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHDMLastAliyunResourceSyncResultResponseBody getBody() {
        return this.body;
    }

}
