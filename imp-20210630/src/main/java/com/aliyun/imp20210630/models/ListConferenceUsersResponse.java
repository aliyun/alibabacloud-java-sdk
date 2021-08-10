// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListConferenceUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConferenceUsersResponseBody body;

    public static ListConferenceUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConferenceUsersResponse self = new ListConferenceUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListConferenceUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConferenceUsersResponse setBody(ListConferenceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConferenceUsersResponseBody getBody() {
        return this.body;
    }

}
