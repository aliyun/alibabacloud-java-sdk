// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContainerConfigurationResponseBody body;

    public static UpdateContainerConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerConfigurationResponse self = new UpdateContainerConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContainerConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContainerConfigurationResponse setBody(UpdateContainerConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContainerConfigurationResponseBody getBody() {
        return this.body;
    }

}
