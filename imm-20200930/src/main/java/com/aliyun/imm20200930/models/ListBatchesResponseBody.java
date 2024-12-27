// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBatchesResponseBody extends TeaModel {
    /**
     * <p>The batch processing tasks.</p>
     */
    @NameInMap("Batches")
    public java.util.List<DataIngestion> batches;

    /**
     * <p>The pagination token.</p>
     * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter. The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEDC9B1F-30F2-4C1F-8ED2-B7860187****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchesResponseBody self = new ListBatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchesResponseBody setBatches(java.util.List<DataIngestion> batches) {
        this.batches = batches;
        return this;
    }
    public java.util.List<DataIngestion> getBatches() {
        return this.batches;
    }

    public ListBatchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
