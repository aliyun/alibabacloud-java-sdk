// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndroidInstanceGroupResponseBody body;

    public static CreateAndroidInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidInstanceGroupResponse self = new CreateAndroidInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndroidInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndroidInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndroidInstanceGroupResponse setBody(CreateAndroidInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndroidInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
