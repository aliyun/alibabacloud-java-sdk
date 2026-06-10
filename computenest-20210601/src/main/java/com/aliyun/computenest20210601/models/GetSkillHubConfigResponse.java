// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillHubConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillHubConfigResponseBody body;

    public static GetSkillHubConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillHubConfigResponse self = new GetSkillHubConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillHubConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillHubConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillHubConfigResponse setBody(GetSkillHubConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillHubConfigResponseBody getBody() {
        return this.body;
    }

}
