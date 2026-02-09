// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeHotpatchResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcubeHotpatchResourceResponseBody body;

    public static DeleteMcubeHotpatchResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeHotpatchResourceResponse self = new DeleteMcubeHotpatchResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeHotpatchResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeHotpatchResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcubeHotpatchResourceResponse setBody(DeleteMcubeHotpatchResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeHotpatchResourceResponseBody getBody() {
        return this.body;
    }

}
