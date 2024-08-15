// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupMonitorSourceTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListServiceGroupMonitorSourceTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceGroupMonitorSourceTemplatesResponse setBody(ListServiceGroupMonitorSourceTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceGroupMonitorSourceTemplatesResponseBody getBody() {
        return this.body;
    }

}
