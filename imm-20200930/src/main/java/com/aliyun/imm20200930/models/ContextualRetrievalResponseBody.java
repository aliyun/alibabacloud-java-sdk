// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualRetrievalResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of files retrieved. The document structure and content are contained in File.Elements.</p>
     */
    @NameInMap("Results")
    public java.util.List<File> results;

    public static ContextualRetrievalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContextualRetrievalResponseBody self = new ContextualRetrievalResponseBody();
        return TeaModel.build(map, self);
    }

    public ContextualRetrievalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContextualRetrievalResponseBody setResults(java.util.List<File> results) {
        this.results = results;
        return this;
    }
    public java.util.List<File> getResults() {
        return this.results;
    }

}
