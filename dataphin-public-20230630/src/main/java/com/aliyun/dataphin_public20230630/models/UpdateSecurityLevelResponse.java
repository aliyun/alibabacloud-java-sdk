// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityLevelResponseBody body;

    public static UpdateSecurityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityLevelResponse self = new UpdateSecurityLevelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityLevelResponse setBody(UpdateSecurityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityLevelResponseBody getBody() {
        return this.body;
    }

}
