// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSkillGroupServiceCapabilityResponse setBody(GetSkillGroupServiceCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupServiceCapabilityResponseBody getBody() {
        return this.body;
    }

}
