// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDiagnoseDetailsResponseBody extends TeaModel {
    @NameInMap("Details")
    public java.util.List<DescribeScalingGroupDiagnoseDetailsResponseBodyDetails> details;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>SecurityGroup</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <strong>example:</strong>
         * <p>AccountArrearage</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
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
