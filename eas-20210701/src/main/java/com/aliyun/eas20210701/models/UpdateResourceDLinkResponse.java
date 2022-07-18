// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceDLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceDLinkResponseBody body;

    public static UpdateResourceDLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceDLinkResponse self = new UpdateResourceDLinkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceDLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceDLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceDLinkResponse setBody(UpdateResourceDLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceDLinkResponseBody getBody() {
        return this.body;
    }

}
