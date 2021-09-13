// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberFromSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemovePhoneNumberFromSkillGroupsResponse setBody(RemovePhoneNumberFromSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumberFromSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
