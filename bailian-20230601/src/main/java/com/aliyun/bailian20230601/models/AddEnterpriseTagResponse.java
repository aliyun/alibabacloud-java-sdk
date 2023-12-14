// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class AddEnterpriseTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddEnterpriseTagResponseBody body;

    public static AddEnterpriseTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseTagResponse self = new AddEnterpriseTagResponse();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnterpriseTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEnterpriseTagResponse setBody(AddEnterpriseTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnterpriseTagResponseBody getBody() {
        return this.body;
    }

}
