// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmMonitorTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmMonitorTemplateResponseBody body;

    public static DescribeCloudGtmMonitorTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmMonitorTemplateResponse self = new DescribeCloudGtmMonitorTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmMonitorTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmMonitorTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmMonitorTemplateResponse setBody(DescribeCloudGtmMonitorTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmMonitorTemplateResponseBody getBody() {
        return this.body;
    }

}
