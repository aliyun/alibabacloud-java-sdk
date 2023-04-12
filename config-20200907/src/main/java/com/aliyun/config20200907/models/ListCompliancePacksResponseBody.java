// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The compliance packages returned.</p>
     */
    @NameInMap("CompliancePacksResult")
    public ListCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCompliancePacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePacksResponseBody self = new ListCompliancePacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompliancePacksResponseBody setCompliancePacksResult(ListCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult) {
        this.compliancePacksResult = compliancePacksResult;
        return this;
    }
    public ListCompliancePacksResponseBodyCompliancePacksResult getCompliancePacksResult() {
        return this.compliancePacksResult;
    }

    public ListCompliancePacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the compliance package belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the compliance package template based on which the compliance package was created.</p>
         */
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        /**
         * <p>The timestamp when the compliance package was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the compliance package.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the resources that are not compliant with the managed rules in the compliance package. Valid values:</p>
         * <br>
         * <p>*   1: high risk level.</p>
         * <p>*   2: medium risk level.</p>
         * <p>*   3: low risk level.</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The status of the compliance package. Valid values:</p>
         * <br>
         * <p>*   ACTIVE: The compliance package is active.</p>
         * <p>*   CREATING: The compliance package is being created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks self = new ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks();
            return TeaModel.build(map, self);
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListCompliancePacksResponseBodyCompliancePacksResult extends TeaModel {
        /**
         * <p>The details of the compliance package.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compliance packages returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCompliancePacksResponseBodyCompliancePacksResult build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePacksResponseBodyCompliancePacksResult self = new ListCompliancePacksResponseBodyCompliancePacksResult();
            return TeaModel.build(map, self);
        }

        public ListCompliancePacksResponseBodyCompliancePacksResult setCompliancePacks(java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks) {
            this.compliancePacks = compliancePacks;
            return this;
        }
        public java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> getCompliancePacks() {
            return this.compliancePacks;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
