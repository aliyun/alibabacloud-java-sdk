// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateAppServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppServiceResponseBody body;

    public static UpdateAppServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppServiceResponse self = new UpdateAppServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppServiceResponse setBody(UpdateAppServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppServiceResponseBody getBody() {
        return this.body;
    }

}
