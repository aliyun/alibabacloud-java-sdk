// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApPortalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApPortalConfigResponseBody body;

    public static SaveApPortalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApPortalConfigResponse self = new SaveApPortalConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApPortalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApPortalConfigResponse setBody(SaveApPortalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApPortalConfigResponseBody getBody() {
        return this.body;
    }

}
