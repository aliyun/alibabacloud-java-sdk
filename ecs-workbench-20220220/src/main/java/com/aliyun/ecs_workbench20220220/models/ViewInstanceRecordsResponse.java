// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ViewInstanceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ViewInstanceRecordsResponseBody body;

    public static ViewInstanceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ViewInstanceRecordsResponse self = new ViewInstanceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ViewInstanceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ViewInstanceRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ViewInstanceRecordsResponse setBody(ViewInstanceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ViewInstanceRecordsResponseBody getBody() {
        return this.body;
    }

}
