// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operations.</p>
     */
    @NameInMap("OperateRuleResult")
    public DeleteConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRulesResponseBody self = new DeleteConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRulesResponseBody setOperateRuleResult(DeleteConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeleteConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DeleteConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   If the rule is disabled, no error code is returned.</p>
         * <p>*   If the rule fails to be disabled, an error code is returned. For more information about error codes, see [Error codes](https://api.alibabacloud.com/document/Config/2020-09-07/errorCode).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result of the delete operation.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeleteConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseBodyOperateRuleResult self = new DeleteConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
