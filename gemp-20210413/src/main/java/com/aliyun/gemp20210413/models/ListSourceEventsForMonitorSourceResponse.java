// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsForMonitorSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSourceEventsForMonitorSourceResponseBody body;

    public static ListSourceEventsForMonitorSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsForMonitorSourceResponse self = new ListSourceEventsForMonitorSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsForMonitorSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourceEventsForMonitorSourceResponse setBody(ListSourceEventsForMonitorSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourceEventsForMonitorSourceResponseBody getBody() {
        return this.body;
    }

}
