// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class SearchSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSkillsResponseBody body;

    public static SearchSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSkillsResponse self = new SearchSkillsResponse();
        return TeaModel.build(map, self);
    }

    public SearchSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSkillsResponse setBody(SearchSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSkillsResponseBody getBody() {
        return this.body;
    }

}
