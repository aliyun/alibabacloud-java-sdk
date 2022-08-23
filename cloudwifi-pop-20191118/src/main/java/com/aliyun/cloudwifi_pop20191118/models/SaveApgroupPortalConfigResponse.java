// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupPortalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApgroupPortalConfigResponseBody body;

    public static SaveApgroupPortalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupPortalConfigResponse self = new SaveApgroupPortalConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApgroupPortalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApgroupPortalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveApgroupPortalConfigResponse setBody(SaveApgroupPortalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApgroupPortalConfigResponseBody getBody() {
        return this.body;
    }

}
