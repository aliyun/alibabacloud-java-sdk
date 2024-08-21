// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ListInstanceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceRecordsResponseBody body;

    public static ListInstanceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRecordsResponse self = new ListInstanceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceRecordsResponse setBody(ListInstanceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRecordsResponseBody getBody() {
        return this.body;
    }

}
