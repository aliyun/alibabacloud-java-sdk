// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhoneNumbersOfSkillGroupResponseBody body;

    public static ListPhoneNumbersOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersOfSkillGroupResponse self = new ListPhoneNumbersOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhoneNumbersOfSkillGroupResponse setBody(ListPhoneNumbersOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneNumbersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
