// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class GetInstanceRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceRecordConfigResponseBody body;

    public static GetInstanceRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRecordConfigResponse self = new GetInstanceRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceRecordConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceRecordConfigResponse setBody(GetInstanceRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceRecordConfigResponseBody getBody() {
        return this.body;
    }

}
