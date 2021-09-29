// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupPortalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public SaveApgroupPortalConfigResponse setBody(SaveApgroupPortalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApgroupPortalConfigResponseBody getBody() {
        return this.body;
    }

}
