// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSkillMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentSkillMetaResponseBody body;

    public static ListDataAgentSkillMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSkillMetaResponse self = new ListDataAgentSkillMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSkillMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentSkillMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentSkillMetaResponse setBody(ListDataAgentSkillMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentSkillMetaResponseBody getBody() {
        return this.body;
    }

}
