// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamOpsRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamOpsRecordsResponseBody body;

    public static ListStreamOpsRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamOpsRecordsResponse self = new ListStreamOpsRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamOpsRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamOpsRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamOpsRecordsResponse setBody(ListStreamOpsRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamOpsRecordsResponseBody getBody() {
        return this.body;
    }

}
