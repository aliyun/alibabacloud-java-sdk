// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupBasicConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApgroupBasicConfigResponseBody body;

    public static SaveApgroupBasicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupBasicConfigResponse self = new SaveApgroupBasicConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApgroupBasicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApgroupBasicConfigResponse setBody(SaveApgroupBasicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApgroupBasicConfigResponseBody getBody() {
        return this.body;
    }

}
