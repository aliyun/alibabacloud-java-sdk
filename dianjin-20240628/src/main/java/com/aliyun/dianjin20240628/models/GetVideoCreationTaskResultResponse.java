// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetVideoCreationTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoCreationTaskResultResponseBody body;

    public static GetVideoCreationTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreationTaskResultResponse self = new GetVideoCreationTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoCreationTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoCreationTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoCreationTaskResultResponse setBody(GetVideoCreationTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoCreationTaskResultResponseBody getBody() {
        return this.body;
    }

}
