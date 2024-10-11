// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateAdHocFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdHocFileResponseBody body;

    public static CreateAdHocFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdHocFileResponse self = new CreateAdHocFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdHocFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdHocFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdHocFileResponse setBody(CreateAdHocFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdHocFileResponseBody getBody() {
        return this.body;
    }

}
