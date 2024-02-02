// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupStatesResponseBody body;

    public static ListSkillGroupStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupStatesResponse self = new ListSkillGroupStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupStatesResponse setBody(ListSkillGroupStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupStatesResponseBody getBody() {
        return this.body;
    }

}
