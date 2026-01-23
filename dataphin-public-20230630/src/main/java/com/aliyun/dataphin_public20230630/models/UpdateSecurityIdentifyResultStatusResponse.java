// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityIdentifyResultStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityIdentifyResultStatusResponseBody body;

    public static UpdateSecurityIdentifyResultStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityIdentifyResultStatusResponse self = new UpdateSecurityIdentifyResultStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityIdentifyResultStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityIdentifyResultStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityIdentifyResultStatusResponse setBody(UpdateSecurityIdentifyResultStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityIdentifyResultStatusResponseBody getBody() {
        return this.body;
    }

}
