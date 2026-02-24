// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachConfigRuleToCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The results of the operation to detach rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AC7AED1-172F-42AE-9C12-295BC2ADB12A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachConfigRuleToCompliancePackResponseBody self = new DetachConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachConfigRuleToCompliancePackResponseBody setOperateRuleResult(DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DetachConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-6cc4626622af00e7****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>This parameter is empty if the operation is successful.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>An error code is returned if the operation fails. For more information about error codes, see the <a href="https://error-center.aliyun.com/status/product/Config">Error Center</a>.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>An error code is returned if the operation fails. For more information about error codes, see the <a href="https://error-center.alibabacloud.com/status/product/Config">Error Center</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigRuleNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>A list of the results of the operation to detach rules.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
