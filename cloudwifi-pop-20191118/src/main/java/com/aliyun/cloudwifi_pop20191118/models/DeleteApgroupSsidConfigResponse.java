// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupSsidConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApgroupSsidConfigResponseBody body;

    public static DeleteApgroupSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupSsidConfigResponse self = new DeleteApgroupSsidConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupSsidConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApgroupSsidConfigResponse setBody(DeleteApgroupSsidConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApgroupSsidConfigResponseBody getBody() {
        return this.body;
    }

}
