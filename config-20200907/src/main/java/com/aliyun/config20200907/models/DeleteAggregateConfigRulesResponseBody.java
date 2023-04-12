// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operations.</p>
     */
    @NameInMap("OperateRuleResult")
    public DeleteAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregateConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigRulesResponseBody self = new DeleteAggregateConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigRulesResponseBody setOperateRuleResult(DeleteAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeleteAggregateConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DeleteAggregateConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   If the rule is deleted, no error code is returned.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   If the rule fails to be deleted, an error code is returned. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true: The request was successful.</p>
         * <p>*   false: The request failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteAggregateConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The details of the result.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeleteAggregateConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateConfigRulesResponseBodyOperateRuleResult self = new DeleteAggregateConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeleteAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
