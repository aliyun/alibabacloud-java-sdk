// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F2D0755D-F350-40FE-9A6D-491859DB5E5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the rule action forwarded error operation data that failed to be forwarded to the destination cloud service. A data forwarding failure indicates that forwarding retries also failed.</p>
     * <ul>
     * <li><strong>true</strong>: forwards error operation data.</li>
     * <li><strong>false</strong>: forwards normal data instead of error operation data.</li>
     * </ul>
     */
    @NameInMap("RuleActionInfo")
    public GetRuleActionResponseBodyRuleActionInfo ruleActionInfo;

    /**
     * <p>The rule action information returned if the call was successful. For more information, see the following parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li><strong>REPUBLISH</strong>: forwards data to another topic.</li>
         * <li><strong>OTS</strong>: stores data to Tablestore.</li>
         * <li><strong>MNS</strong>: sends data to Message Service (MNS).</li>
         * <li><strong>FC</strong>: sends data to Function Compute.</li>
         * <li><strong>RDS</strong>: Save to cloud databases.</li>
         * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        /**
         * <p>The ID of the rule based on which the rule action is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>152323</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The configurations of the rule action.</p>
         * 
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
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
