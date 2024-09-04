// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVideoDnaGroupResponseBody body;

    public static DeleteVideoDnaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaGroupResponse self = new DeleteVideoDnaGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoDnaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVideoDnaGroupResponse setBody(DeleteVideoDnaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoDnaGroupResponseBody getBody() {
        return this.body;
    }

}
