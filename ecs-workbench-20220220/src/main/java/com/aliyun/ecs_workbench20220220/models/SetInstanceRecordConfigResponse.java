// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class SetInstanceRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstanceRecordConfigResponseBody body;

    public static SetInstanceRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceRecordConfigResponse self = new SetInstanceRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceRecordConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceRecordConfigResponse setBody(SetInstanceRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceRecordConfigResponseBody getBody() {
        return this.body;
    }

}
