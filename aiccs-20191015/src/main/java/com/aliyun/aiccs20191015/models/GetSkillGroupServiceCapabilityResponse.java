// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillGroupServiceCapabilityResponseBody body;

    public static GetSkillGroupServiceCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceCapabilityResponse self = new GetSkillGroupServiceCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupServiceCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupServiceCapabilityResponse setBody(GetSkillGroupServiceCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupServiceCapabilityResponseBody getBody() {
        return this.body;
    }

}
