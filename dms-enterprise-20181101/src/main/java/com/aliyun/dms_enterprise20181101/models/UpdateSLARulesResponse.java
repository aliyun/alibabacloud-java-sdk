// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateSLARulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSLARulesResponseBody body;

    public static UpdateSLARulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSLARulesResponse self = new UpdateSLARulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSLARulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSLARulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSLARulesResponse setBody(UpdateSLARulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSLARulesResponseBody getBody() {
        return this.body;
    }

}
