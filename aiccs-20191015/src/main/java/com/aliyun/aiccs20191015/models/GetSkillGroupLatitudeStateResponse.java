// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupLatitudeStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupLatitudeStateResponseBody body;

    public static GetSkillGroupLatitudeStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupLatitudeStateResponse self = new GetSkillGroupLatitudeStateResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupLatitudeStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupLatitudeStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillGroupLatitudeStateResponse setBody(GetSkillGroupLatitudeStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupLatitudeStateResponseBody getBody() {
        return this.body;
    }

}
