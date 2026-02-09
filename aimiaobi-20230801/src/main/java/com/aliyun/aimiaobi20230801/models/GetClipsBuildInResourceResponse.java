// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetClipsBuildInResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClipsBuildInResourceResponseBody body;

    public static GetClipsBuildInResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClipsBuildInResourceResponse self = new GetClipsBuildInResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetClipsBuildInResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClipsBuildInResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClipsBuildInResourceResponse setBody(GetClipsBuildInResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClipsBuildInResourceResponseBody getBody() {
        return this.body;
    }

}
