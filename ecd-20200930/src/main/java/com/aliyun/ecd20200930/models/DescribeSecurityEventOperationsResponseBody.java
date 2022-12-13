// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The operations performed on the alert.
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
        // The code of the operation performed on the alert. Valid values:
        // 
        // *   mark_mis_info: adds the alert to the whitelist without configuring rules. This operation is triggered by adding multiple alerts to the whitelist at a time.
        // *   advance_mark_mis_inf: adds the alert to the whitelist by configuring advanced rules.
        // *   defense_mark_mis_info: adds the alert to the whitelist by configuring precise defense rules.
        // *   rm_mark_mis_info: removes the alert from the whitelist.
        // *   rm_defense_mark_mis_info: removes the alert from the whitelist configured with precise defense rules.
        // *   manual_handled: manually handles the alert.
        // *   ignore: ignores the alert.
        // *   quara: quarantines the source file of the malicious process.
        // *   block_ip: blocks access from the source IP address.
        // *   kill_and_quara: terminates the malicious process and quarantines the source file.
        @NameInMap("OperationCode")
        public String operationCode;

        // The parameters of the operation.
        @NameInMap("OperationParams")
        public String operationParams;

        // Indicates whether the alert can be handled. Valid values:
        // 
        // *   true: The alert can be handled.
        // *   false: The alert cannot be handled.
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
