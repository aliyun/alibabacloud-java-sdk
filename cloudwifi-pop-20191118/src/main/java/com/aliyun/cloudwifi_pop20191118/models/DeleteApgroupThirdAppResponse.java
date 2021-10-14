// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupThirdAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApgroupThirdAppResponseBody body;

    public static DeleteApgroupThirdAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupThirdAppResponse self = new DeleteApgroupThirdAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupThirdAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApgroupThirdAppResponse setBody(DeleteApgroupThirdAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApgroupThirdAppResponseBody getBody() {
        return this.body;
    }

}
