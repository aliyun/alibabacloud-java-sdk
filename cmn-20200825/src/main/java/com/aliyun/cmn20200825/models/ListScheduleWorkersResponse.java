// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleWorkersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScheduleWorkersResponseBody body;

    public static ListScheduleWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleWorkersResponse self = new ListScheduleWorkersResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleWorkersResponse setBody(ListScheduleWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleWorkersResponseBody getBody() {
        return this.body;
    }

}
