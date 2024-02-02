// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteStudioAppDomainOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStudioAppDomainOpenResponseBody body;

    public static DeleteStudioAppDomainOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStudioAppDomainOpenResponse self = new DeleteStudioAppDomainOpenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStudioAppDomainOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStudioAppDomainOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStudioAppDomainOpenResponse setBody(DeleteStudioAppDomainOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStudioAppDomainOpenResponseBody getBody() {
        return this.body;
    }

}
