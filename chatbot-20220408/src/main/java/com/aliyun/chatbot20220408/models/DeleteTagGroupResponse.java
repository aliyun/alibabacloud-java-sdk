// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTagGroupResponseBody body;

    public static DeleteTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagGroupResponse self = new DeleteTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagGroupResponse setBody(DeleteTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagGroupResponseBody getBody() {
        return this.body;
    }

}
