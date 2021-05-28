// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAlertContactGroupResponseBody body;

    public static SearchAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupResponse self = new SearchAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertContactGroupResponse setBody(SearchAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
