// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTrunksOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrunksOfSkillGroupResponseBody body;

    public static ListTrunksOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrunksOfSkillGroupResponse self = new ListTrunksOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTrunksOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrunksOfSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrunksOfSkillGroupResponse setBody(ListTrunksOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrunksOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
