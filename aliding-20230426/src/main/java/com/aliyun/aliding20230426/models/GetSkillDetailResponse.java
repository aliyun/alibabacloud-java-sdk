// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillDetailResponseBody body;

    public static GetSkillDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillDetailResponse self = new GetSkillDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillDetailResponse setBody(GetSkillDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillDetailResponseBody getBody() {
        return this.body;
    }

}
