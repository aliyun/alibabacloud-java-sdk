// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAppraiseLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLegacyAppraiseLogsResponseBody body;

    public static ListLegacyAppraiseLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAppraiseLogsResponse self = new ListLegacyAppraiseLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLegacyAppraiseLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLegacyAppraiseLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLegacyAppraiseLogsResponse setBody(ListLegacyAppraiseLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLegacyAppraiseLogsResponseBody getBody() {
        return this.body;
    }

}
