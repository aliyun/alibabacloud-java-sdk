// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class DeleteUnbeianIpCheckTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUnbeianIpCheckTypeResponseBody body;

    public static DeleteUnbeianIpCheckTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnbeianIpCheckTypeResponse self = new DeleteUnbeianIpCheckTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUnbeianIpCheckTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUnbeianIpCheckTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUnbeianIpCheckTypeResponse setBody(DeleteUnbeianIpCheckTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUnbeianIpCheckTypeResponseBody getBody() {
        return this.body;
    }

}
