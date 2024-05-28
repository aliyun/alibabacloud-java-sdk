// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmMonitorTemplateRemarkResponseBody body;

    public static UpdateCloudGtmMonitorTemplateRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateRemarkResponse self = new UpdateCloudGtmMonitorTemplateRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmMonitorTemplateRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmMonitorTemplateRemarkResponse setBody(UpdateCloudGtmMonitorTemplateRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmMonitorTemplateRemarkResponseBody getBody() {
        return this.body;
    }

}
