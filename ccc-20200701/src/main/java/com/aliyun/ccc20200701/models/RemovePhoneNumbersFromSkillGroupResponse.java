// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumbersFromSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemovePhoneNumbersFromSkillGroupResponseBody body;

    public static RemovePhoneNumbersFromSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumbersFromSkillGroupResponse self = new RemovePhoneNumbersFromSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumbersFromSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePhoneNumbersFromSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePhoneNumbersFromSkillGroupResponse setBody(RemovePhoneNumbersFromSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumbersFromSkillGroupResponseBody getBody() {
        return this.body;
    }

}
