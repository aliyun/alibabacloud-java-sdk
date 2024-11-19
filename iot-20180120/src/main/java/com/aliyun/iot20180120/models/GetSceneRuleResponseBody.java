// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSceneRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSceneRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1B6D50A7-F160-4D47-863C-EDEE25E26495</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSceneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRuleResponseBody self = new GetSceneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSceneRuleResponseBody setData(GetSceneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSceneRuleResponseBodyData getData() {
        return this.data;
    }

    public GetSceneRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSceneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSceneRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1584085921000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1579493552000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;action\&quot;:[{\&quot;params\&quot;:{\&quot;productKey\&quot;:\&quot;a19luLB****\&quot;,\&quot;propertyItems\&quot;:{\&quot;LightAdjustLevel\&quot;:10},\&quot;deviceName\&quot;:\&quot;test01\&quot;},\&quot;uri\&quot;:\&quot;action/device/setProperty\&quot;}],\&quot;trigger\&quot;:{\&quot;params\&quot;:{\&quot;cron\&quot;:\&quot;22 13 20 1 <em>\&quot;,\&quot;cronType\&quot;:\&quot;linux\&quot;},\&quot;uri\&quot;:\&quot;trigger/timer\&quot;},\&quot;type\&quot;:\&quot;IFTTT\&quot;,\&quot;sid\&quot;:\&quot;9df954b33c854d469a507ef8d6</em>*****\&quot;}</p>
         */
        @NameInMap("RuleContent")
        public String ruleContent;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        public static GetSceneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSceneRuleResponseBodyData self = new GetSceneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSceneRuleResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSceneRuleResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetSceneRuleResponseBodyData setRuleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public String getRuleContent() {
            return this.ruleContent;
        }

        public GetSceneRuleResponseBodyData setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetSceneRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSceneRuleResponseBodyData setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
