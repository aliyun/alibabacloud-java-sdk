// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProjectMemberResponseBody body;

    public static AddProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberResponse self = new AddProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProjectMemberResponse setBody(AddProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProjectMemberResponseBody getBody() {
        return this.body;
    }

}
