// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupsResponseBody body;

    public static ListSkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsResponse self = new ListSkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupsResponse setBody(ListSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
