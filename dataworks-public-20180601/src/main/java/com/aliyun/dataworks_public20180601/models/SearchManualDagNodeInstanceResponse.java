// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SearchManualDagNodeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchManualDagNodeInstanceResponseBody body;

    public static SearchManualDagNodeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchManualDagNodeInstanceResponse self = new SearchManualDagNodeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SearchManualDagNodeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchManualDagNodeInstanceResponse setBody(SearchManualDagNodeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchManualDagNodeInstanceResponseBody getBody() {
        return this.body;
    }

}
