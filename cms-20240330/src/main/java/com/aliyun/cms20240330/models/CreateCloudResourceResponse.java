// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateCloudResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudResourceResponseBody body;

    public static CreateCloudResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceResponse self = new CreateCloudResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudResourceResponse setBody(CreateCloudResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudResourceResponseBody getBody() {
        return this.body;
    }

}
