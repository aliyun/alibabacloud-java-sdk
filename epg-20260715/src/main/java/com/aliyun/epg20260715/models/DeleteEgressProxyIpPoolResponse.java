// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyIpPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEgressProxyIpPoolResponseBody body;

    public static DeleteEgressProxyIpPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyIpPoolResponse self = new DeleteEgressProxyIpPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyIpPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEgressProxyIpPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEgressProxyIpPoolResponse setBody(DeleteEgressProxyIpPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEgressProxyIpPoolResponseBody getBody() {
        return this.body;
    }

}
