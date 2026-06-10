// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteSkillSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSkillSpaceResponseBody body;

    public static DeleteSkillSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillSpaceResponse self = new DeleteSkillSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSkillSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSkillSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSkillSpaceResponse setBody(DeleteSkillSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillSpaceResponseBody getBody() {
        return this.body;
    }

}
