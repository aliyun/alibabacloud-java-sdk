// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteLoginProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLoginProfileResponseBody body;

    public static DeleteLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginProfileResponse self = new DeleteLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoginProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLoginProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLoginProfileResponse setBody(DeleteLoginProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLoginProfileResponseBody getBody() {
        return this.body;
    }

}
