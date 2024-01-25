// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddContainerClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddContainerClusterResponseBody body;

    public static AddContainerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContainerClusterResponse self = new AddContainerClusterResponse();
        return TeaModel.build(map, self);
    }

    public AddContainerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContainerClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContainerClusterResponse setBody(AddContainerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContainerClusterResponseBody getBody() {
        return this.body;
    }

}
