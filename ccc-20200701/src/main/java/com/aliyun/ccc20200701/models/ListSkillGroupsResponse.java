// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSkillGroupsResponse setBody(ListSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
