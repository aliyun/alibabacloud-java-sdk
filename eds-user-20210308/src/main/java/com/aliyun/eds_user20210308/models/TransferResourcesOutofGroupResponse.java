// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesOutofGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferResourcesOutofGroupResponseBody body;

    public static TransferResourcesOutofGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesOutofGroupResponse self = new TransferResourcesOutofGroupResponse();
        return TeaModel.build(map, self);
    }

    public TransferResourcesOutofGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferResourcesOutofGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferResourcesOutofGroupResponse setBody(TransferResourcesOutofGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferResourcesOutofGroupResponseBody getBody() {
        return this.body;
    }

}
