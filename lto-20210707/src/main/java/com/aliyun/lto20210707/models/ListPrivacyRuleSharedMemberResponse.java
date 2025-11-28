// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleSharedMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivacyRuleSharedMemberResponseBody body;

    public static ListPrivacyRuleSharedMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleSharedMemberResponse self = new ListPrivacyRuleSharedMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleSharedMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivacyRuleSharedMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivacyRuleSharedMemberResponse setBody(ListPrivacyRuleSharedMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivacyRuleSharedMemberResponseBody getBody() {
        return this.body;
    }

}
