// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmMonitorTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudGtmMonitorTemplateResponseBody body;

    public static CreateCloudGtmMonitorTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmMonitorTemplateResponse self = new CreateCloudGtmMonitorTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmMonitorTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudGtmMonitorTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudGtmMonitorTemplateResponse setBody(CreateCloudGtmMonitorTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudGtmMonitorTemplateResponseBody getBody() {
        return this.body;
    }

}
