// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddCasesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c58b9719-3bc3-441d-a4d3-fc0309ef7066</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("CaseList")
    public java.util.List<AddCasesRequestCaseList> caseList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AddCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasesRequest self = new AddCasesRequest();
        return TeaModel.build(map, self);
    }

    public AddCasesRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AddCasesRequest setCaseList(java.util.List<AddCasesRequestCaseList> caseList) {
        this.caseList = caseList;
        return this;
    }
    public java.util.List<AddCasesRequestCaseList> getCaseList() {
        return this.caseList;
    }

    public AddCasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class AddCasesRequestCaseList extends TeaModel {
        @NameInMap("Caller")
        public String caller;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("MaskedCallee")
        public String maskedCallee;

        /**
         * <strong>example:</strong>
         * <p>188888****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static AddCasesRequestCaseList build(java.util.Map<String, ?> map) throws Exception {
            AddCasesRequestCaseList self = new AddCasesRequestCaseList();
            return TeaModel.build(map, self);
        }

        public AddCasesRequestCaseList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public AddCasesRequestCaseList setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public AddCasesRequestCaseList setMaskedCallee(String maskedCallee) {
            this.maskedCallee = maskedCallee;
            return this;
        }
        public String getMaskedCallee() {
            return this.maskedCallee;
        }

        public AddCasesRequestCaseList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public AddCasesRequestCaseList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
