// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillsResponseBody body;

    public static GetSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillsResponse self = new GetSkillsResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillsResponse setBody(GetSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillsResponseBody getBody() {
        return this.body;
    }

}
