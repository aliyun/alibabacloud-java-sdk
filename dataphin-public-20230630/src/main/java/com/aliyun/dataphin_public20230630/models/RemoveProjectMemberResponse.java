// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveProjectMemberResponseBody body;

    public static RemoveProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectMemberResponse self = new RemoveProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveProjectMemberResponse setBody(RemoveProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveProjectMemberResponseBody getBody() {
        return this.body;
    }

}
