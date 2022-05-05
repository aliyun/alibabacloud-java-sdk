// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateContactGroupResponseBody body;

    public static CreateOrUpdateContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactGroupResponse self = new CreateOrUpdateContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateContactGroupResponse setBody(CreateOrUpdateContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateContactGroupResponseBody getBody() {
        return this.body;
    }

}
