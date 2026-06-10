// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillSpaceResponseBody body;

    public static GetSkillSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillSpaceResponse self = new GetSkillSpaceResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillSpaceResponse setBody(GetSkillSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillSpaceResponseBody getBody() {
        return this.body;
    }

}
