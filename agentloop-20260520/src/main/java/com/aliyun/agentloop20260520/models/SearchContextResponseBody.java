// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of retrieval results, sorted by similarity in descending order.</p>
     */
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
