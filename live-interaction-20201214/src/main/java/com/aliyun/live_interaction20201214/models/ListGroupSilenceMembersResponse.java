// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupSilenceMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupSilenceMembersResponseBody body;

    public static ListGroupSilenceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupSilenceMembersResponse self = new ListGroupSilenceMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupSilenceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupSilenceMembersResponse setBody(ListGroupSilenceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupSilenceMembersResponseBody getBody() {
        return this.body;
    }

}
