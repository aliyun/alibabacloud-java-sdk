// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the rule action forwarded error operation data that failed to be forwarded to the destination cloud service. A data forwarding failure indicates that forwarding retries also failed.</p>
     * <br>
     * <p>*   **true**: forwards error operation data.</p>
     * <p>*   **false**: forwards normal data instead of error operation data.</p>
     */
    @NameInMap("RuleActionInfo")
    public GetRuleActionResponseBodyRuleActionInfo ruleActionInfo;

    /**
     * <p>The rule action information returned if the call was successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRuleActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionResponseBody self = new GetRuleActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleActionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleActionResponseBody setRuleActionInfo(GetRuleActionResponseBodyRuleActionInfo ruleActionInfo) {
        this.ruleActionInfo = ruleActionInfo;
        return this;
    }
    public GetRuleActionResponseBodyRuleActionInfo getRuleActionInfo() {
        return this.ruleActionInfo;
    }

    public GetRuleActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleActionResponseBodyRuleActionInfo extends TeaModel {
        /**
         * <p>The ID of rule action.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The type of the rule action. Valid values:</p>
         * <br>
         * <p>*   **REPUBLISH**: forwards data to another topic.</p>
         * <p>*   **OTS**: stores data to Tablestore.</p>
         * <p>*   **MNS**: sends data to Message Service (MNS).</p>
         * <p>*   **FC**: sends data to Function Compute.</p>
         * <p>*   **RDS**: Save to cloud databases.</p>
         * <p>*   **AMQP**: forwards data to an AMQP consumer group.</p>
         */
        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        /**
         * <p>The ID of the rule based on which the rule action is performed.</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The configurations of the rule action.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRuleActionResponseBodyRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleActionResponseBodyRuleActionInfo self = new GetRuleActionResponseBodyRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleActionResponseBodyRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetRuleActionResponseBodyRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

        public GetRuleActionResponseBodyRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRuleActionResponseBodyRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetRuleActionResponseBodyRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
