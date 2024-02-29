// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateUdfFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUdfFileResponseBody body;

    public static UpdateUdfFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfFileResponse self = new UpdateUdfFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUdfFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUdfFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUdfFileResponse setBody(UpdateUdfFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUdfFileResponseBody getBody() {
        return this.body;
    }

}
