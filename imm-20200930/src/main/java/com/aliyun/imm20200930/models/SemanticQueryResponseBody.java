// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<File> files;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalHits")
    public Long totalHits;

    public static SemanticQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SemanticQueryResponseBody self = new SemanticQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SemanticQueryResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public SemanticQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SemanticQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SemanticQueryResponseBody setTotalHits(Long totalHits) {
        this.totalHits = totalHits;
        return this;
    }
    public Long getTotalHits() {
        return this.totalHits;
    }

}
