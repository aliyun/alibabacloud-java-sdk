// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteStudioAppDomainOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteStudioAppDomainOpenResponse setBody(DeleteStudioAppDomainOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStudioAppDomainOpenResponseBody getBody() {
        return this.body;
    }

}
