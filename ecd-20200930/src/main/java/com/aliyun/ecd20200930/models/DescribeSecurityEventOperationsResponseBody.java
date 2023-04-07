// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operations performed on the alert.</p>
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
        /**
         * <p>The code of the operation performed on the alert. Valid values:</p>
         * <br>
         * <p>*   mark_mis_info: adds the alert to the whitelist without configuring rules. This operation is triggered by adding multiple alerts to the whitelist at a time.</p>
         * <p>*   advance_mark_mis_inf: adds the alert to the whitelist by configuring advanced rules.</p>
         * <p>*   defense_mark_mis_info: adds the alert to the whitelist by configuring precise defense rules.</p>
         * <p>*   rm_mark_mis_info: removes the alert from the whitelist.</p>
         * <p>*   rm_defense_mark_mis_info: removes the alert from the whitelist configured with precise defense rules.</p>
         * <p>*   manual_handled: manually handles the alert.</p>
         * <p>*   ignore: ignores the alert.</p>
         * <p>*   quara: quarantines the source file of the malicious process.</p>
         * <p>*   block_ip: blocks access from the source IP address.</p>
         * <p>*   kill_and_quara: terminates the malicious process and quarantines the source file.</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The parameters of the operation.</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        /**
         * <p>Indicates whether the alert can be handled. Valid values:</p>
         * <br>
         * <p>*   true: The alert can be handled.</p>
         * <p>*   false: The alert cannot be handled.</p>
         */
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
