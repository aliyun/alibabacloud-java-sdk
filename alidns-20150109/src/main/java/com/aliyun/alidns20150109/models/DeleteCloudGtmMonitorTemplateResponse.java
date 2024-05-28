// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmMonitorTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudGtmMonitorTemplateResponseBody body;

    public static DeleteCloudGtmMonitorTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmMonitorTemplateResponse self = new DeleteCloudGtmMonitorTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmMonitorTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudGtmMonitorTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudGtmMonitorTemplateResponse setBody(DeleteCloudGtmMonitorTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudGtmMonitorTemplateResponseBody getBody() {
        return this.body;
    }

}
