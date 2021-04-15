// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmContactGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmContactGroupsResponseBody body;

    public static ListAlarmContactGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmContactGroupsResponse self = new ListAlarmContactGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmContactGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmContactGroupsResponse setBody(ListAlarmContactGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmContactGroupsResponseBody getBody() {
        return this.body;
    }

}
