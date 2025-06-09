// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PartitionSummaries body;

    public static ListPartitionSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionSummariesResponse self = new ListPartitionSummariesResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionSummariesResponse setBody(PartitionSummaries body) {
        this.body = body;
        return this;
    }
    public PartitionSummaries getBody() {
        return this.body;
    }

}
