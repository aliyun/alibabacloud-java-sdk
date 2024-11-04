// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteVirtualResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualResourceResponseBody body;

    public static DeleteVirtualResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualResourceResponse self = new DeleteVirtualResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualResourceResponse setBody(DeleteVirtualResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualResourceResponseBody getBody() {
        return this.body;
    }

}
