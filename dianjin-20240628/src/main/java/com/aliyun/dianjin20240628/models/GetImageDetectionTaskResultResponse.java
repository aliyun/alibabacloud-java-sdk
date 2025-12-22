// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetImageDetectionTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageDetectionTaskResultResponseBody body;

    public static GetImageDetectionTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageDetectionTaskResultResponse self = new GetImageDetectionTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageDetectionTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageDetectionTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageDetectionTaskResultResponse setBody(GetImageDetectionTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageDetectionTaskResultResponseBody getBody() {
        return this.body;
    }

}
