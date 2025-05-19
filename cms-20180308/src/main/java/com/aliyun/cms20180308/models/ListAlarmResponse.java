// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlarmResponseBody body;

    public static ListAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmResponse self = new ListAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmResponse setBody(ListAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmResponseBody getBody() {
        return this.body;
    }

}
