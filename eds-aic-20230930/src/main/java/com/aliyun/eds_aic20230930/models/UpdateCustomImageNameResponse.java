// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCustomImageNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomImageNameResponseBody body;

    public static UpdateCustomImageNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomImageNameResponse self = new UpdateCustomImageNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomImageNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomImageNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomImageNameResponse setBody(UpdateCustomImageNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomImageNameResponseBody getBody() {
        return this.body;
    }

}
