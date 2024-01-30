// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteUserDefineRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserDefineRegionResponseBody body;

    public static DeleteUserDefineRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineRegionResponse self = new DeleteUserDefineRegionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDefineRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDefineRegionResponse setBody(DeleteUserDefineRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDefineRegionResponseBody getBody() {
        return this.body;
    }

}
