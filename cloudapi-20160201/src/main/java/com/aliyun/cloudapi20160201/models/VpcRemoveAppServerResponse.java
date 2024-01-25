// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRemoveAppServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VpcRemoveAppServerResponseBody body;

    public static VpcRemoveAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcRemoveAppServerResponse self = new VpcRemoveAppServerResponse();
        return TeaModel.build(map, self);
    }

    public VpcRemoveAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcRemoveAppServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcRemoveAppServerResponse setBody(VpcRemoveAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcRemoveAppServerResponseBody getBody() {
        return this.body;
    }

}
