// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachAlbServerGroupsResponseBody body;

    public static DetachAlbServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAlbServerGroupsResponse self = new DetachAlbServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DetachAlbServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachAlbServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachAlbServerGroupsResponse setBody(DetachAlbServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAlbServerGroupsResponseBody getBody() {
        return this.body;
    }

}
