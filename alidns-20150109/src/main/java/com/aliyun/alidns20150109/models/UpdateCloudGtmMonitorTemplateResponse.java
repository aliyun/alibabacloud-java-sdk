// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmMonitorTemplateResponseBody body;

    public static UpdateCloudGtmMonitorTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateResponse self = new UpdateCloudGtmMonitorTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmMonitorTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmMonitorTemplateResponse setBody(UpdateCloudGtmMonitorTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmMonitorTemplateResponseBody getBody() {
        return this.body;
    }

}
