// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUserLevelsOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListUserLevelsOfSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserLevelsOfSkillGroupResponse setBody(ListUserLevelsOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
