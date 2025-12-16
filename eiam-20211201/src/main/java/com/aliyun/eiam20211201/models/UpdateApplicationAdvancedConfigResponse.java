// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationAdvancedConfigResponseBody body;

    public static UpdateApplicationAdvancedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAdvancedConfigResponse self = new UpdateApplicationAdvancedConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAdvancedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationAdvancedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationAdvancedConfigResponse setBody(UpdateApplicationAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
