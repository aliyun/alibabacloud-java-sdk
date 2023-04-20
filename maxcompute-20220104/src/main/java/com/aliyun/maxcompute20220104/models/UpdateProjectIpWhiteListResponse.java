// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProjectIpWhiteListResponseBody body;

    public static UpdateProjectIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectIpWhiteListResponse self = new UpdateProjectIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectIpWhiteListResponse setBody(UpdateProjectIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
