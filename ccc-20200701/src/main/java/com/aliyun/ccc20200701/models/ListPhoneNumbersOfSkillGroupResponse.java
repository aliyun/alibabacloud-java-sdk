// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListPhoneNumbersOfSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPhoneNumbersOfSkillGroupResponse setBody(ListPhoneNumbersOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneNumbersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
