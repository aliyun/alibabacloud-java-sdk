// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallSkillsResponseBody body;

    public static UninstallSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallSkillsResponse self = new UninstallSkillsResponse();
        return TeaModel.build(map, self);
    }

    public UninstallSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallSkillsResponse setBody(UninstallSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallSkillsResponseBody getBody() {
        return this.body;
    }

}
