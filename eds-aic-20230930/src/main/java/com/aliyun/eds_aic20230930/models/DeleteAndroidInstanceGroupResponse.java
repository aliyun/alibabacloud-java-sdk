// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAndroidInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAndroidInstanceGroupResponseBody body;

    public static DeleteAndroidInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAndroidInstanceGroupResponse self = new DeleteAndroidInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAndroidInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAndroidInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAndroidInstanceGroupResponse setBody(DeleteAndroidInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAndroidInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
