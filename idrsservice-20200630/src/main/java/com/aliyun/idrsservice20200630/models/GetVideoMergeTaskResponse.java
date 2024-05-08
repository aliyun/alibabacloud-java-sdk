// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetVideoMergeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoMergeTaskResponseBody body;

    public static GetVideoMergeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoMergeTaskResponse self = new GetVideoMergeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoMergeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoMergeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoMergeTaskResponse setBody(GetVideoMergeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoMergeTaskResponseBody getBody() {
        return this.body;
    }

}
