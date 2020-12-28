// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationCloneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckConfigurationCloneResponseBody body;

    public static CheckConfigurationCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationCloneResponse self = new CheckConfigurationCloneResponse();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckConfigurationCloneResponse setBody(CheckConfigurationCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConfigurationCloneResponseBody getBody() {
        return this.body;
    }

}
