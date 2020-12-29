// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveGtmResourceGroupResponseBody body;

    public static MoveGtmResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveGtmResourceGroupResponse self = new MoveGtmResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveGtmResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveGtmResourceGroupResponse setBody(MoveGtmResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveGtmResourceGroupResponseBody getBody() {
        return this.body;
    }

}
