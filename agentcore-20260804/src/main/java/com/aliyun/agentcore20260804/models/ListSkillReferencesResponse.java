// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSkillReferencesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillReferencesResponseBody body;

    public static ListSkillReferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillReferencesResponse self = new ListSkillReferencesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillReferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillReferencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillReferencesResponse setBody(ListSkillReferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillReferencesResponseBody getBody() {
        return this.body;
    }

}
