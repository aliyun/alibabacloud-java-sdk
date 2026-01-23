// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityIdentifyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityIdentifyResultResponseBody body;

    public static CreateSecurityIdentifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIdentifyResultResponse self = new CreateSecurityIdentifyResultResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIdentifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityIdentifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityIdentifyResultResponse setBody(CreateSecurityIdentifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityIdentifyResultResponseBody getBody() {
        return this.body;
    }

}
