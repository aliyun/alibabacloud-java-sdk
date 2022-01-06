// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationMonitorDetectResultResponseBody body;

    public static ListApplicationMonitorDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorDetectResultResponse self = new ListApplicationMonitorDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMonitorDetectResultResponse setBody(ListApplicationMonitorDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMonitorDetectResultResponseBody getBody() {
        return this.body;
    }

}
