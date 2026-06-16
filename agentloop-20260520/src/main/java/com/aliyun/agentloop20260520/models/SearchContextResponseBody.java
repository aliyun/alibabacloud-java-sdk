// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<java.util.Map<String, ?>> results;

    public static SearchContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchContextResponseBody self = new SearchContextResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchContextResponseBody setResults(java.util.List<java.util.Map<String, ?>> results) {
        this.results = results;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResults() {
        return this.results;
    }

}
