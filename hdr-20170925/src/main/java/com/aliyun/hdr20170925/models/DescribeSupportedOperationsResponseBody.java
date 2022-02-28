// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSupportedOperationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Operations")
    public DescribeSupportedOperationsResponseBodyOperations operations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSupportedOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedOperationsResponseBody self = new DescribeSupportedOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedOperationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSupportedOperationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSupportedOperationsResponseBody setOperations(DescribeSupportedOperationsResponseBodyOperations operations) {
        this.operations = operations;
        return this;
    }
    public DescribeSupportedOperationsResponseBodyOperations getOperations() {
        return this.operations;
    }

    public DescribeSupportedOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportedOperationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSupportedOperationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSupportedOperationsResponseBodyOperationsOperation extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeSupportedOperationsResponseBodyOperationsOperation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedOperationsResponseBodyOperationsOperation self = new DescribeSupportedOperationsResponseBodyOperationsOperation();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedOperationsResponseBodyOperationsOperation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeSupportedOperationsResponseBodyOperations extends TeaModel {
        @NameInMap("operation")
        public java.util.List<DescribeSupportedOperationsResponseBodyOperationsOperation> operation;

        public static DescribeSupportedOperationsResponseBodyOperations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedOperationsResponseBodyOperations self = new DescribeSupportedOperationsResponseBodyOperations();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedOperationsResponseBodyOperations setOperation(java.util.List<DescribeSupportedOperationsResponseBodyOperationsOperation> operation) {
            this.operation = operation;
            return this;
        }
        public java.util.List<DescribeSupportedOperationsResponseBodyOperationsOperation> getOperation() {
            return this.operation;
        }

    }

}
