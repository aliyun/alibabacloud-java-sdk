// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupAuthAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetGroupAuthAppCodeResponseBody body;

    public static SetGroupAuthAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupAuthAppCodeResponse self = new SetGroupAuthAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupAuthAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupAuthAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGroupAuthAppCodeResponse setBody(SetGroupAuthAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupAuthAppCodeResponseBody getBody() {
        return this.body;
    }

}
