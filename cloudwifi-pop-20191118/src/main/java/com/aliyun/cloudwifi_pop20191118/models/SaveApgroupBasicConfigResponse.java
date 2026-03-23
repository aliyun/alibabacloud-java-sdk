// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupBasicConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveApgroupBasicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveApgroupBasicConfigResponse setBody(SaveApgroupBasicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApgroupBasicConfigResponseBody getBody() {
        return this.body;
    }

}
