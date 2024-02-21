// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExtendConfigResponseBody body;

    public static UpdateExtendConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendConfigResponse self = new UpdateExtendConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExtendConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExtendConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExtendConfigResponse setBody(UpdateExtendConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExtendConfigResponseBody getBody() {
        return this.body;
    }

}
