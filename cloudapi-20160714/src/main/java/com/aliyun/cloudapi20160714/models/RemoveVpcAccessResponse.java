// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveVpcAccessResponseBody body;

    public static RemoveVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessResponse self = new RemoveVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVpcAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVpcAccessResponse setBody(RemoveVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVpcAccessResponseBody getBody() {
        return this.body;
    }

}
