// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPublicSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicSkillsResponseBody body;

    public static ListPublicSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicSkillsResponse self = new ListPublicSkillsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicSkillsResponse setBody(ListPublicSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicSkillsResponseBody getBody() {
        return this.body;
    }

}
