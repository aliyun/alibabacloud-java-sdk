// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmMonitorTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmMonitorTemplatesResponseBody body;

    public static ListCloudGtmMonitorTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmMonitorTemplatesResponse self = new ListCloudGtmMonitorTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmMonitorTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmMonitorTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmMonitorTemplatesResponse setBody(ListCloudGtmMonitorTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmMonitorTemplatesResponseBody getBody() {
        return this.body;
    }

}
