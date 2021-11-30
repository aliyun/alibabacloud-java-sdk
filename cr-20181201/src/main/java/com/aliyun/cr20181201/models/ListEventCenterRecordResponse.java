// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListEventCenterRecordResponse setBody(ListEventCenterRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventCenterRecordResponseBody getBody() {
        return this.body;
    }

}
