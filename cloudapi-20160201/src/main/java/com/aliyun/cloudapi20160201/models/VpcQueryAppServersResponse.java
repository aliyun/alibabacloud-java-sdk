// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcQueryAppServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VpcQueryAppServersResponseBody body;

    public static VpcQueryAppServersResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcQueryAppServersResponse self = new VpcQueryAppServersResponse();
        return TeaModel.build(map, self);
    }

    public VpcQueryAppServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcQueryAppServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcQueryAppServersResponse setBody(VpcQueryAppServersResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcQueryAppServersResponseBody getBody() {
        return this.body;
    }

}
