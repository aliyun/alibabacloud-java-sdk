// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStandardGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStandardGroupResponseBody body;

    public static CreateStandardGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardGroupResponse self = new CreateStandardGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardGroupResponse setBody(CreateStandardGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardGroupResponseBody getBody() {
        return this.body;
    }

}
