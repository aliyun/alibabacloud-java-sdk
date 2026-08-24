// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVirusFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirusFileResponseBody body;

    public static DeleteVirusFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirusFileResponse self = new DeleteVirusFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirusFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirusFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirusFileResponse setBody(DeleteVirusFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirusFileResponseBody getBody() {
        return this.body;
    }

}
