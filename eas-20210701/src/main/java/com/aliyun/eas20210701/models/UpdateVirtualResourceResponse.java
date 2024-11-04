// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateVirtualResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirtualResourceResponseBody body;

    public static UpdateVirtualResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualResourceResponse self = new UpdateVirtualResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirtualResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirtualResourceResponse setBody(UpdateVirtualResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualResourceResponseBody getBody() {
        return this.body;
    }

}
