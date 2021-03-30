// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewApgroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NewApgroupConfigResponseBody body;

    public static NewApgroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        NewApgroupConfigResponse self = new NewApgroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public NewApgroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NewApgroupConfigResponse setBody(NewApgroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public NewApgroupConfigResponseBody getBody() {
        return this.body;
    }

}
