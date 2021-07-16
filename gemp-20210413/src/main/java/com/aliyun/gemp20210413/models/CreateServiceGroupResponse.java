// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceGroupResponseBody body;

    public static CreateServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupResponse self = new CreateServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceGroupResponse setBody(CreateServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceGroupResponseBody getBody() {
        return this.body;
    }

}
