// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ParseSkillPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ParseSkillPackageResponseBody body;

    public static ParseSkillPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ParseSkillPackageResponse self = new ParseSkillPackageResponse();
        return TeaModel.build(map, self);
    }

    public ParseSkillPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ParseSkillPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ParseSkillPackageResponse setBody(ParseSkillPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ParseSkillPackageResponseBody getBody() {
        return this.body;
    }

}
