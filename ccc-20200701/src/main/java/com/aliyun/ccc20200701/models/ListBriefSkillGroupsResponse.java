// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBriefSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListBriefSkillGroupsResponse setBody(ListBriefSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBriefSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
