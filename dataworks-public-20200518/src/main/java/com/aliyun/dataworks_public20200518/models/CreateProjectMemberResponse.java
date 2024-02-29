// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProjectMemberResponseBody body;

    public static CreateProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberResponse self = new CreateProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectMemberResponse setBody(CreateProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectMemberResponseBody getBody() {
        return this.body;
    }

}
