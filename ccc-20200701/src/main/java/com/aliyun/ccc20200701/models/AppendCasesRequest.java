// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AppendCasesRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("InstanceId")
    public String instanceId;

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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("MaskedCallee")
        public String maskedCallee;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

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
