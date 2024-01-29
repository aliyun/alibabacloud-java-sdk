// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachAlbServerGroupsResponseBody body;

    public static AttachAlbServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachAlbServerGroupsResponse self = new AttachAlbServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AttachAlbServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachAlbServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachAlbServerGroupsResponse setBody(AttachAlbServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachAlbServerGroupsResponseBody getBody() {
        return this.body;
    }

}
