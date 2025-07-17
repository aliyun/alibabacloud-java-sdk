// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDiagnoseDetailsResponseBody extends TeaModel {
    /**
     * <p>The diagnostic reports.</p>
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
         * <p>The type of the diagnostic item. Valid values:</p>
         * <ul>
         * <li>AccountArrearage: Checks whether your Alibaba Cloud account has overdue payments.</li>
         * <li>AccountNotEnoughBalance: Checks whether the balance of your Alibaba Cloud account is sufficient.</li>
         * <li>ElasticStrength: Checks whether the instance types that are specified in the scaling configuration are sufficient.</li>
         * <li>VSwitch: Checks whether the vSwitch is available. If the specified vSwitch is deleted, specify an existing vSwitch for the scaling group.</li>
         * <li>SecurityGroup: Checks whether the security group is available. If the specified security group is deleted, specify an existing security group for the scaling group.</li>
         * <li>KeyPair: Checks whether the key pair is available. If the specified key pair is deleted, specify another key pair for the scaling group.</li>
         * <li>SlbBackendServerQuota: Checks whether the number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
         * <li>AlbBackendServerQuota: Checks whether the number of ECS instances that are attached to the ALB instances of the scaling group has reached the upper limit.</li>
         * <li>NlbBackendServerQuota: Checks whether the number of ECS instances that are attached to the NLB instances of the scaling group has reached the upper limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityGroup</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <p>The error code of the diagnostic item. Valid values:</p>
         * <ul>
         * <li>VSwitchIdNotFound: The vSwitch does not exist.</li>
         * <li>SecurityGroupNotFound: The security group does not exist.</li>
         * <li>KeyPairNotFound: The key pair does not exist.</li>
         * <li>SlbBackendServerQuotaExceeded: The number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
         * <li>AlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the ALB instances of the scaling group has reached the upper limit.</li>
         * <li>NlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the NLB instances of the scaling group has reached the upper limit.</li>
         * <li>AccountArrearage: Your account has an overdue payment.</li>
         * <li>AccountNotEnoughBalance: The balance of your Alibaba Cloud account is insufficient.</li>
         * <li>ElasticStrengthAlert: The inventory levels are lower than required.</li>
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
