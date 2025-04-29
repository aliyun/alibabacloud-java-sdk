// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDiagnoseDetailsResponseBody extends TeaModel {
    /**
     * <p>Details of the diagnostic report.</p>
     */
    @NameInMap("Details")
    public java.util.List<DescribeScalingGroupDiagnoseDetailsResponseBodyDetails> details;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>688B18B8-FB1E-42EB-A1ED-7F55B090****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScalingGroupDiagnoseDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupDiagnoseDetailsResponseBody self = new DescribeScalingGroupDiagnoseDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupDiagnoseDetailsResponseBody setDetails(java.util.List<DescribeScalingGroupDiagnoseDetailsResponseBodyDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<DescribeScalingGroupDiagnoseDetailsResponseBodyDetails> getDetails() {
        return this.details;
    }

    public DescribeScalingGroupDiagnoseDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScalingGroupDiagnoseDetailsResponseBodyDetails extends TeaModel {
        /**
         * <p>Item type for diagnostics. Possible values:</p>
         * <ul>
         * <li>AccountArrearage: Checks if the user\&quot;s account is in arrears.</li>
         * <li>AccountNotEnoughBalance: Checks the account balance.</li>
         * <li>ElasticStrength: Checks the inventory health of instance types corresponding to the scaling group configuration.</li>
         * <li>VSwitch: Checks if the switch is available, for example, whether it has been deleted.</li>
         * <li>SecurityGroup: Checks if the security group is available, for example, whether it has been deleted.</li>
         * <li>KeyPair: Checks if the key pair is available, for example, whether it has been deleted.</li>
         * <li>SlbBackendServerQuota: Checks if the number of ECS instances mounted to the default SLB group and virtual server group exceeds the quota.</li>
         * <li>AlbBackendServerQuota: Checks if the number of ECS instances mounted to the ALB group exceeds the quota.</li>
         * <li>NlbBackendServerQuota: Checks if the number of ECS instances mounted to the NLB group exceeds the quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityGroup</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <p>Error code of the diagnostic item. Possible values:</p>
         * <ul>
         * <li><p>VSwitchIdNotFound: The VSwitch does not exist.</p>
         * </li>
         * <li><p>SecurityGroupNotFound: The security group does not exist.</p>
         * </li>
         * <li><p>KeyPairNotFound: The key pair does not exist.</p>
         * </li>
         * <li><p>SlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the SLB default group and virtual server group exceeds the quota.</p>
         * </li>
         * <li><p>AlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the ALB group exceeds the quota.</p>
         * </li>
         * <li><p>NlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the NLB group exceeds the quota.</p>
         * </li>
         * <li><p>AccountArrearage: The account is in arrears.</p>
         * </li>
         * <li><p>AccountNotEnoughBalance: The account balance is insufficient.</p>
         * </li>
         * <li><p>ElasticStrengthAlert: The inventory health is poor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountArrearage</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The resource ID corresponding to the diagnostic result.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Status of the diagnostic item. Possible values:</p>
         * <ul>
         * <li><p>Normal: The diagnostic result is normal.</p>
         * </li>
         * <li><p>Warn: The diagnostic result is a warning.</p>
         * </li>
         * <li><p>Critical: The diagnostic result is critical.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeScalingGroupDiagnoseDetailsResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDiagnoseDetailsResponseBodyDetails self = new DescribeScalingGroupDiagnoseDetailsResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBodyDetails setDiagnoseType(String diagnoseType) {
            this.diagnoseType = diagnoseType;
            return this;
        }
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBodyDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBodyDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBodyDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
