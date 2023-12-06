// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestPatchSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMergeRequestPatchSetsResponseBody body;

    public static ListMergeRequestPatchSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestPatchSetsResponse self = new ListMergeRequestPatchSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestPatchSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestPatchSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMergeRequestPatchSetsResponse setBody(ListMergeRequestPatchSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestPatchSetsResponseBody getBody() {
        return this.body;
    }

}
