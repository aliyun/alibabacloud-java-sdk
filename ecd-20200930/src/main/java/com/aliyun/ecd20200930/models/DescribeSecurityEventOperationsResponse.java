// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityEventOperations")
    @Validation(required = true)
    public java.util.List<DescribeSecurityEventOperationsResponseSecurityEventOperations> securityEventOperations;

    public static DescribeSecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsResponse self = new DescribeSecurityEventOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationsResponse setSecurityEventOperations(java.util.List<DescribeSecurityEventOperationsResponseSecurityEventOperations> securityEventOperations) {
        this.securityEventOperations = securityEventOperations;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationsResponseSecurityEventOperations> getSecurityEventOperations() {
        return this.securityEventOperations;
    }

    public static class DescribeSecurityEventOperationsResponseSecurityEventOperations extends TeaModel {
        @NameInMap("OperationCode")
        @Validation(required = true)
        public String operationCode;

        @NameInMap("OperationParams")
        @Validation(required = true)
        public String operationParams;

        @NameInMap("UserCanOperate")
        @Validation(required = true)
        public Boolean userCanOperate;

        public static DescribeSecurityEventOperationsResponseSecurityEventOperations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseSecurityEventOperations self = new DescribeSecurityEventOperationsResponseSecurityEventOperations();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseSecurityEventOperations setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public DescribeSecurityEventOperationsResponseSecurityEventOperations setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public DescribeSecurityEventOperationsResponseSecurityEventOperations setUserCanOperate(Boolean userCanOperate) {
            this.userCanOperate = userCanOperate;
            return this;
        }
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

    }

}
