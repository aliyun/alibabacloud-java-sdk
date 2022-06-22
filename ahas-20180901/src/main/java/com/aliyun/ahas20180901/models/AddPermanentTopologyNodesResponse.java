// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddPermanentTopologyNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddPermanentTopologyNodesResponseBody body;

    public static AddPermanentTopologyNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPermanentTopologyNodesResponse self = new AddPermanentTopologyNodesResponse();
        return TeaModel.build(map, self);
    }

    public AddPermanentTopologyNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPermanentTopologyNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPermanentTopologyNodesResponse setBody(AddPermanentTopologyNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPermanentTopologyNodesResponseBody getBody() {
        return this.body;
    }

}
