// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetResourceOptimizeHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceOptimizeHistoryListResponseBody body;

    public static GetResourceOptimizeHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOptimizeHistoryListResponse self = new GetResourceOptimizeHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceOptimizeHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceOptimizeHistoryListResponse setBody(GetResourceOptimizeHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceOptimizeHistoryListResponseBody getBody() {
        return this.body;
    }

}
