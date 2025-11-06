// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMdsCubeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMdsCubeResourceResponseBody body;

    public static UpdateMdsCubeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMdsCubeResourceResponse self = new UpdateMdsCubeResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMdsCubeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMdsCubeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMdsCubeResourceResponse setBody(UpdateMdsCubeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMdsCubeResourceResponseBody getBody() {
        return this.body;
    }

}
