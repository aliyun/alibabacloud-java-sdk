// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AppendCasesRequest extends TeaModel {
    /**
     * <p>The predictive outbound campaign ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>78cf6864-9a22-4ea8-a59d-5adc2d747b0e</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of outbound call cases in the request body.</p>
     */
    @NameInMap("body")
    public java.util.List<AppendCasesRequestBody> body;

    public static AppendCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesRequest self = new AppendCasesRequest();
        return TeaModel.build(map, self);
    }

    public AppendCasesRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AppendCasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppendCasesRequest setBody(java.util.List<AppendCasesRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<AppendCasesRequestBody> getBody() {
        return this.body;
    }

    public static class AppendCasesRequestBody extends TeaModel {
        /**
         * <p>The agent ID of the specified agent to which the call is transferred. If this field is not empty, the system transfers the call to the specified agent. If this field is empty, the system assigns the call to an idle agent in the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The caller number. If this field is not empty, the outbound call system preferentially uses the provided number as the caller to initiate the call. If this field is empty, the system automatically selects a caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>01012345678</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>The custom variables defined by the customer. The value is a JSON object that contains up to 10 properties. The name and value of each property are defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;name&quot;: &quot;customer&quot;,
         *       &quot;Customer tag&quot;: &quot;tag&quot;
         * }</p>
         */
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <p>The masked callee number. If this field is not empty, the callee number is masked based on custom rules defined by the customer. You only need to enter the masked callee number. If a masked callee number is used, the masked number is displayed in certain scenarios, and the actual callee number cannot be viewed.</p>
         * 
         * <strong>example:</strong>
         * <p>071*****801</p>
         */
        @NameInMap("MaskedCallee")
        public String maskedCallee;

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>188888****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The business ID, which is the identifier in the customer\&quot;s business system and is used for integration scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static AppendCasesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            AppendCasesRequestBody self = new AppendCasesRequestBody();
            return TeaModel.build(map, self);
        }

        public AppendCasesRequestBody setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public AppendCasesRequestBody setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public AppendCasesRequestBody setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public AppendCasesRequestBody setMaskedCallee(String maskedCallee) {
            this.maskedCallee = maskedCallee;
            return this;
        }
        public String getMaskedCallee() {
            return this.maskedCallee;
        }

        public AppendCasesRequestBody setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public AppendCasesRequestBody setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
