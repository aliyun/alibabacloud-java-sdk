// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppInstanceGroupResponseBody body;

    public static CreateAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceGroupResponse self = new CreateAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppInstanceGroupResponse setBody(CreateAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
