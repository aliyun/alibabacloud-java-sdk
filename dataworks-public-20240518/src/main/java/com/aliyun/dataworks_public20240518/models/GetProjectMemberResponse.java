// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectMemberResponseBody body;

    public static GetProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberResponse self = new GetProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectMemberResponse setBody(GetProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectMemberResponseBody getBody() {
        return this.body;
    }

}
