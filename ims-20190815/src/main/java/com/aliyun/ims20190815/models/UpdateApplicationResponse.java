// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationResponseBody body;

    public static UpdateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponse self = new UpdateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationResponse setBody(UpdateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationResponseBody getBody() {
        return this.body;
    }

}
