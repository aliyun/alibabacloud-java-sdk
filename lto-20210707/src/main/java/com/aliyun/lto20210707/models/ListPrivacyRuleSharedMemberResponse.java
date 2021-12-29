// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleSharedMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPrivacyRuleSharedMemberResponse setBody(ListPrivacyRuleSharedMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivacyRuleSharedMemberResponseBody getBody() {
        return this.body;
    }

}
