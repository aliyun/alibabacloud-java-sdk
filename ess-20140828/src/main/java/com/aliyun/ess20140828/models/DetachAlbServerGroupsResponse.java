// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetachAlbServerGroupsResponse setBody(DetachAlbServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAlbServerGroupsResponseBody getBody() {
        return this.body;
    }

}
