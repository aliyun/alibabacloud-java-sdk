// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupMonitorSourceTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceGroupMonitorSourceTemplatesResponseBody body;

    public static ListServiceGroupMonitorSourceTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupMonitorSourceTemplatesResponse self = new ListServiceGroupMonitorSourceTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupMonitorSourceTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceGroupMonitorSourceTemplatesResponse setBody(ListServiceGroupMonitorSourceTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceGroupMonitorSourceTemplatesResponseBody getBody() {
        return this.body;
    }

}
