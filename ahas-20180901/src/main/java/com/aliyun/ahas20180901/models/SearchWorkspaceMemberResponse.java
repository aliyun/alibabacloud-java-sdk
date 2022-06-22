// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchWorkspaceMemberResponseBody body;

    public static SearchWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkspaceMemberResponse self = new SearchWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public SearchWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchWorkspaceMemberResponse setBody(SearchWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
