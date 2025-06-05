// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillResponseBody body;

    public static ListSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillResponse self = new ListSkillResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillResponse setBody(ListSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillResponseBody getBody() {
        return this.body;
    }

}
