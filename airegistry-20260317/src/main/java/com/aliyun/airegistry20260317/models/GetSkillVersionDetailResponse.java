// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillVersionDetailResponseBody body;

    public static GetSkillVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillVersionDetailResponse self = new GetSkillVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillVersionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillVersionDetailResponse setBody(GetSkillVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillVersionDetailResponseBody getBody() {
        return this.body;
    }

}
