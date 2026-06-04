// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityDefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaEntityDefResponseBody body;

    public static UpdateMetaEntityDefResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityDefResponse self = new UpdateMetaEntityDefResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityDefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaEntityDefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaEntityDefResponse setBody(UpdateMetaEntityDefResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaEntityDefResponseBody getBody() {
        return this.body;
    }

}
