// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AttachAlbServerGroupsResponse setBody(AttachAlbServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachAlbServerGroupsResponseBody getBody() {
        return this.body;
    }

}
