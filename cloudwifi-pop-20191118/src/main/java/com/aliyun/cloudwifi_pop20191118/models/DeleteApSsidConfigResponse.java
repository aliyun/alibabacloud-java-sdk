// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApSsidConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApSsidConfigResponseBody body;

    public static DeleteApSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApSsidConfigResponse self = new DeleteApSsidConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApSsidConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApSsidConfigResponse setBody(DeleteApSsidConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApSsidConfigResponseBody getBody() {
        return this.body;
    }

}
