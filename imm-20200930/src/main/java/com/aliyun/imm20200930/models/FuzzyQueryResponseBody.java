// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<File> files;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 本次请求的唯一 Id
    @NameInMap("RequestId")
    public String requestId;

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

}
