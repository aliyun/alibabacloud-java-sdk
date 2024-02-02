// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBriefSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBriefSkillGroupsResponseBody body;

    public static ListBriefSkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBriefSkillGroupsResponse self = new ListBriefSkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListBriefSkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBriefSkillGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBriefSkillGroupsResponse setBody(ListBriefSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBriefSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
