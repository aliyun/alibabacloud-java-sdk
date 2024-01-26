// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDesktopGroupResponseBody body;

    public static DeleteDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopGroupResponse self = new DeleteDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDesktopGroupResponse setBody(DeleteDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
