// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachAggregateConfigRuleToCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The results of the operations to remove one or more rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB12A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachAggregateConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachAggregateConfigRuleToCompliancePackResponseBody self = new DetachAggregateConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachAggregateConfigRuleToCompliancePackResponseBody setOperateRuleResult(DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DetachAggregateConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-a124626622af00e7****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>This parameter is empty if the rule is removed from the compliance package.</li>
         * <li>An error code is returned if the rule fails to be removed from the compliance package. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigRuleNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result of the operation to remove the rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
