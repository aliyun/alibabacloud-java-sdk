// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillBizTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillBizTagsResponseBody body;

    public static UpdateSkillBizTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillBizTagsResponse self = new UpdateSkillBizTagsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillBizTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillBizTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillBizTagsResponse setBody(UpdateSkillBizTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillBizTagsResponseBody getBody() {
        return this.body;
    }

}
