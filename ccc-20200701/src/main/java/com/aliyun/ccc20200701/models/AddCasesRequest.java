// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddCasesRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("CaseList")
    public java.util.List<AddCasesRequestCaseList> caseList;

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
        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        public static AddCasesRequestCaseList build(java.util.Map<String, ?> map) throws Exception {
            AddCasesRequestCaseList self = new AddCasesRequestCaseList();
            return TeaModel.build(map, self);
        }

        public AddCasesRequestCaseList setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
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
