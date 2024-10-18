// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingCodeUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineStagingCodeUploadInfoResponseBody body;

    public static GetRoutineStagingCodeUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineStagingCodeUploadInfoResponse self = new GetRoutineStagingCodeUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineStagingCodeUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineStagingCodeUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineStagingCodeUploadInfoResponse setBody(GetRoutineStagingCodeUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineStagingCodeUploadInfoResponseBody getBody() {
        return this.body;
    }

}
