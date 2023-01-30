// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppInstanceGroupResponseBody body;

    public static DeleteAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceGroupResponse self = new DeleteAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppInstanceGroupResponse setBody(DeleteAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
