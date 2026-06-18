// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesIntoGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferResourcesIntoGroupResponseBody body;

    public static TransferResourcesIntoGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesIntoGroupResponse self = new TransferResourcesIntoGroupResponse();
        return TeaModel.build(map, self);
    }

    public TransferResourcesIntoGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferResourcesIntoGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferResourcesIntoGroupResponse setBody(TransferResourcesIntoGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferResourcesIntoGroupResponseBody getBody() {
        return this.body;
    }

}
