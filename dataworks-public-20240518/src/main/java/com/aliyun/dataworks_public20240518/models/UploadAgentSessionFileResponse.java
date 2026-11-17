// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadAgentSessionFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAgentSessionFileResponseBody body;

    public static UploadAgentSessionFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSessionFileResponse self = new UploadAgentSessionFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadAgentSessionFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAgentSessionFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAgentSessionFileResponse setBody(UploadAgentSessionFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAgentSessionFileResponseBody getBody() {
        return this.body;
    }

}
