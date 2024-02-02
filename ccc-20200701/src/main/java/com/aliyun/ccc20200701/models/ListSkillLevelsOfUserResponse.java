// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillLevelsOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillLevelsOfUserResponseBody body;

    public static ListSkillLevelsOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillLevelsOfUserResponse self = new ListSkillLevelsOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillLevelsOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillLevelsOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillLevelsOfUserResponse setBody(ListSkillLevelsOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillLevelsOfUserResponseBody getBody() {
        return this.body;
    }

}
