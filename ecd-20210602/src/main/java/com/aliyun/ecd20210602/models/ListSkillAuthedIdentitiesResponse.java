// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSkillAuthedIdentitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillAuthedIdentitiesResponseBody body;

    public static ListSkillAuthedIdentitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillAuthedIdentitiesResponse self = new ListSkillAuthedIdentitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillAuthedIdentitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillAuthedIdentitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillAuthedIdentitiesResponse setBody(ListSkillAuthedIdentitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillAuthedIdentitiesResponseBody getBody() {
        return this.body;
    }

}
