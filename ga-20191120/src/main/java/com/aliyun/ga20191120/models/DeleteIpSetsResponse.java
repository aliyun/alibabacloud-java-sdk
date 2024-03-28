// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpSetsResponseBody body;

    public static DeleteIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetsResponse self = new DeleteIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpSetsResponse setBody(DeleteIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpSetsResponseBody getBody() {
        return this.body;
    }

}
