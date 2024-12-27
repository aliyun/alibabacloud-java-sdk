// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryResponseBody extends TeaModel {
    /**
     * <p>The files.</p>
     */
    @NameInMap("Files")
    public java.util.List<File> files;

    /**
     * <p>A pagination token.</p>
     * <p>It can be used in the next request to retrieve a new page of results.</p>
     * <p>If NextToken is empty, no next page exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of hits.</p>
     */
    @NameInMap("TotalHits")
    public Long totalHits;

    public static FuzzyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FuzzyQueryResponseBody self = new FuzzyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FuzzyQueryResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public FuzzyQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FuzzyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FuzzyQueryResponseBody setTotalHits(Long totalHits) {
        this.totalHits = totalHits;
        return this;
    }
    public Long getTotalHits() {
        return this.totalHits;
    }

}
