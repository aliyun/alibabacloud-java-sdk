// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageFromAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageFromAppInstanceGroupResponseBody body;

    public static CreateImageFromAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageFromAppInstanceGroupResponse self = new CreateImageFromAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageFromAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageFromAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageFromAppInstanceGroupResponse setBody(CreateImageFromAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageFromAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
