// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventCenterRecordResponseBody body;

    public static ListEventCenterRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRecordResponse self = new ListEventCenterRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventCenterRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventCenterRecordResponse setBody(ListEventCenterRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventCenterRecordResponseBody getBody() {
        return this.body;
    }

}
