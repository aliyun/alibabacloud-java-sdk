// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListOperationRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationRecordResponseBody body;

    public static ListOperationRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationRecordResponse self = new ListOperationRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationRecordResponse setBody(ListOperationRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationRecordResponseBody getBody() {
        return this.body;
    }

}
