// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContactGroupResponseBody body;

    public static DeleteContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupResponse self = new DeleteContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactGroupResponse setBody(DeleteContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactGroupResponseBody getBody() {
        return this.body;
    }

}
