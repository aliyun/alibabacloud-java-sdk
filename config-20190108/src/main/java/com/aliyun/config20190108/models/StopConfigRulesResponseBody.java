// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StopConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The result information about the operation.</p>
     */
    @NameInMap("OperateRuleResult")
    public StopConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopConfigRulesResponseBody self = new StopConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopConfigRulesResponseBody setOperateRuleResult(StopConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public StopConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public StopConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   If the rule is disabled, no error code is returned.</p>
         * <p>*   If you fail to disable the rule, an error code is returned. For more information, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the rule is disabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class StopConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result information about each rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static StopConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseBodyOperateRuleResult self = new StopConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
