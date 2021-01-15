// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmStatusHistoriesResponseBody body;

    public static ListAlarmStatusHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusHistoriesResponse self = new ListAlarmStatusHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmStatusHistoriesResponse setBody(ListAlarmStatusHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmStatusHistoriesResponseBody getBody() {
        return this.body;
    }

}
