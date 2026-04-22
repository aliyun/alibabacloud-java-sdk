// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateAclGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAclGroupResponseBody body;

    public static CreateAclGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclGroupResponse self = new CreateAclGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAclGroupResponse setBody(CreateAclGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclGroupResponseBody getBody() {
        return this.body;
    }

}
