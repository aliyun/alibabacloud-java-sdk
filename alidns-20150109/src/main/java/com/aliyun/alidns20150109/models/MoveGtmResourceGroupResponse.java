// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public MoveGtmResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveGtmResourceGroupResponse setBody(MoveGtmResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveGtmResourceGroupResponseBody getBody() {
        return this.body;
    }

}
