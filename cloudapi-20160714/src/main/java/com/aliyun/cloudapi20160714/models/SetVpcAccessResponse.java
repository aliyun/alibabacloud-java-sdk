// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVpcAccessResponseBody body;

    public static SetVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVpcAccessResponse self = new SetVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public SetVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVpcAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVpcAccessResponse setBody(SetVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVpcAccessResponseBody getBody() {
        return this.body;
    }

}
