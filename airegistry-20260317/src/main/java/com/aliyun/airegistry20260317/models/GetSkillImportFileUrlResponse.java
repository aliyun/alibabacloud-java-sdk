// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillImportFileUrlResponseBody body;

    public static GetSkillImportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillImportFileUrlResponse self = new GetSkillImportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillImportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillImportFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillImportFileUrlResponse setBody(GetSkillImportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillImportFileUrlResponseBody getBody() {
        return this.body;
    }

}
