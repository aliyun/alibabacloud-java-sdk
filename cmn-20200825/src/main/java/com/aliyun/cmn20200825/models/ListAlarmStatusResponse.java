// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmStatusResponseBody body;

    public static ListAlarmStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusResponse self = new ListAlarmStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmStatusResponse setBody(ListAlarmStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmStatusResponseBody getBody() {
        return this.body;
    }

}
