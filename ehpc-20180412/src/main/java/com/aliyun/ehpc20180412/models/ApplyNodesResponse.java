// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyNodesResponseBody body;

    public static ApplyNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesResponse self = new ApplyNodesResponse();
        return TeaModel.build(map, self);
    }

    public ApplyNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyNodesResponse setBody(ApplyNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyNodesResponseBody getBody() {
        return this.body;
    }

}
