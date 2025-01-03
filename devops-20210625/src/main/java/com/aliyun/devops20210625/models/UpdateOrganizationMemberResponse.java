// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateOrganizationMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOrganizationMemberResponseBody body;

    public static UpdateOrganizationMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationMemberResponse self = new UpdateOrganizationMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrganizationMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrganizationMemberResponse setBody(UpdateOrganizationMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrganizationMemberResponseBody getBody() {
        return this.body;
    }

}
