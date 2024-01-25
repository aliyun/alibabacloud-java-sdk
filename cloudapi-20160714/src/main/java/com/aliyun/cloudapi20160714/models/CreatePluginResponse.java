// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePluginResponseBody body;

    public static CreatePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginResponse self = new CreatePluginResponse();
        return TeaModel.build(map, self);
    }

    public CreatePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePluginResponse setBody(CreatePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePluginResponseBody getBody() {
        return this.body;
    }

}
