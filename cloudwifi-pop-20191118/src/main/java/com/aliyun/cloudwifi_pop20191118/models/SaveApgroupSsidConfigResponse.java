// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupSsidConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApgroupSsidConfigResponseBody body;

    public static SaveApgroupSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupSsidConfigResponse self = new SaveApgroupSsidConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApgroupSsidConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApgroupSsidConfigResponse setBody(SaveApgroupSsidConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApgroupSsidConfigResponseBody getBody() {
        return this.body;
    }

}
