// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the alert.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("SecurityEventOperations")
    public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperations> securityEventOperations;

    public static DescribeSecurityEventOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsResponseBody self = new DescribeSecurityEventOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationsResponseBody setSecurityEventOperations(java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperations> securityEventOperations) {
        this.securityEventOperations = securityEventOperations;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperations> getSecurityEventOperations() {
        return this.securityEventOperations;
    }

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperations extends TeaModel {
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The operation that you want to perform. Set the value to DescribeSecurityEventOperations.</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        @NameInMap("UserCanOperate")
        public Boolean userCanOperate;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperations self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperations();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperations setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperations setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperations setUserCanOperate(Boolean userCanOperate) {
            this.userCanOperate = userCanOperate;
            return this;
        }
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

    }

}
