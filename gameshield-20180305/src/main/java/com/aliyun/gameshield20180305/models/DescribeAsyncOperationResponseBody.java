// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAsyncOperationResponseBody extends TeaModel {
    @NameInMap("AsyncOperation")
    public DescribeAsyncOperationResponseBodyAsyncOperation asyncOperation;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeAsyncOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncOperationResponseBody self = new DescribeAsyncOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncOperationResponseBody setAsyncOperation(DescribeAsyncOperationResponseBodyAsyncOperation asyncOperation) {
        this.asyncOperation = asyncOperation;
        return this;
    }
    public DescribeAsyncOperationResponseBodyAsyncOperation getAsyncOperation() {
        return this.asyncOperation;
    }

    public DescribeAsyncOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncOperationResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeAsyncOperationResponseBodyAsyncOperation extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static DescribeAsyncOperationResponseBodyAsyncOperation build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncOperationResponseBodyAsyncOperation self = new DescribeAsyncOperationResponseBodyAsyncOperation();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncOperationResponseBodyAsyncOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
