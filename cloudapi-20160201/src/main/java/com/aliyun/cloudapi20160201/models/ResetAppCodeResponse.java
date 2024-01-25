// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAppCodeResponseBody body;

    public static ResetAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeResponse self = new ResetAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppCodeResponse setBody(ResetAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppCodeResponseBody getBody() {
        return this.body;
    }

}
