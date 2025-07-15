// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUEventSubRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRtcMPUEventSubRecordResponseBody body;

    public static ListRtcMPUEventSubRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUEventSubRecordResponse self = new ListRtcMPUEventSubRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUEventSubRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRtcMPUEventSubRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRtcMPUEventSubRecordResponse setBody(ListRtcMPUEventSubRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRtcMPUEventSubRecordResponseBody getBody() {
        return this.body;
    }

}
