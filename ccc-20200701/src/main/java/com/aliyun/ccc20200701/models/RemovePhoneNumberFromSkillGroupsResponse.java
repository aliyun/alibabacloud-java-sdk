// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberFromSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePhoneNumberFromSkillGroupsResponseBody body;

    public static RemovePhoneNumberFromSkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumberFromSkillGroupsResponse self = new RemovePhoneNumberFromSkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumberFromSkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePhoneNumberFromSkillGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePhoneNumberFromSkillGroupsResponse setBody(RemovePhoneNumberFromSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumberFromSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
