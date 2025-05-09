// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GenerateSqlFromNLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateSqlFromNLResponseBody body;

    public static GenerateSqlFromNLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSqlFromNLResponse self = new GenerateSqlFromNLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSqlFromNLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSqlFromNLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateSqlFromNLResponse setBody(GenerateSqlFromNLResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSqlFromNLResponseBody getBody() {
        return this.body;
    }

}
