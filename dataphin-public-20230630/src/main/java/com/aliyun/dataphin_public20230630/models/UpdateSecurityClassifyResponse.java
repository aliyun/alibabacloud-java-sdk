// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityClassifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityClassifyResponseBody body;

    public static UpdateSecurityClassifyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityClassifyResponse self = new UpdateSecurityClassifyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityClassifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityClassifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityClassifyResponse setBody(UpdateSecurityClassifyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityClassifyResponseBody getBody() {
        return this.body;
    }

}
