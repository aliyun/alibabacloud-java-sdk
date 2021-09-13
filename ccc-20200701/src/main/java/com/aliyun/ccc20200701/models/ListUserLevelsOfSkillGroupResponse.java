// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUserLevelsOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserLevelsOfSkillGroupResponseBody body;

    public static ListUserLevelsOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserLevelsOfSkillGroupResponse self = new ListUserLevelsOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListUserLevelsOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserLevelsOfSkillGroupResponse setBody(ListUserLevelsOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
