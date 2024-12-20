// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupLatitudeStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
