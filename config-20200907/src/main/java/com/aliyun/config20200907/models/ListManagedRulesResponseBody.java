// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListManagedRulesResponseBody extends TeaModel {
    @NameInMap("ManagedRules")
    public java.util.List<ListManagedRulesResponseBodyManagedRules> managedRules;

    @NameInMap("RequestId")
    public String requestId;

    public static ListManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesResponseBody self = new ListManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesResponseBody setManagedRules(java.util.List<ListManagedRulesResponseBodyManagedRules> managedRules) {
        this.managedRules = managedRules;
        return this;
    }
    public java.util.List<ListManagedRulesResponseBodyManagedRules> getManagedRules() {
        return this.managedRules;
    }

    public ListManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListManagedRulesResponseBodyManagedRulesManagedRuleList extends TeaModel {
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("Description")
        public String description;

        @NameInMap("HelpUrls")
        public String helpUrls;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static ListManagedRulesResponseBodyManagedRulesManagedRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesResponseBodyManagedRulesManagedRuleList self = new ListManagedRulesResponseBodyManagedRulesManagedRuleList();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setHelpUrls(String helpUrls) {
            this.helpUrls = helpUrls;
            return this;
        }
        public String getHelpUrls() {
            return this.helpUrls;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ListManagedRulesResponseBodyManagedRulesManagedRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListManagedRulesResponseBodyManagedRules extends TeaModel {
        @NameInMap("ManagedRuleList")
        public java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> managedRuleList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListManagedRulesResponseBodyManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesResponseBodyManagedRules self = new ListManagedRulesResponseBodyManagedRules();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesResponseBodyManagedRules setManagedRuleList(java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> managedRuleList) {
            this.managedRuleList = managedRuleList;
            return this;
        }
        public java.util.List<ListManagedRulesResponseBodyManagedRulesManagedRuleList> getManagedRuleList() {
            return this.managedRuleList;
        }

        public ListManagedRulesResponseBodyManagedRules setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListManagedRulesResponseBodyManagedRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListManagedRulesResponseBodyManagedRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
