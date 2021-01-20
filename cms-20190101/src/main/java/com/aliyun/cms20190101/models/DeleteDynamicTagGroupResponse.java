// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteDynamicTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDynamicTagGroupResponseBody body;

    public static DeleteDynamicTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicTagGroupResponse self = new DeleteDynamicTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDynamicTagGroupResponse setBody(DeleteDynamicTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDynamicTagGroupResponseBody getBody() {
        return this.body;
    }

}
