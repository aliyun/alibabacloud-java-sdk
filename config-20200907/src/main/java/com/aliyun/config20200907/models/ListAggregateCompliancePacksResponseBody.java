// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance packages.</p>
     */
    @NameInMap("CompliancePacksResult")
    public ListAggregateCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateCompliancePacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateCompliancePacksResponseBody self = new ListAggregateCompliancePacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateCompliancePacksResponseBody setCompliancePacksResult(ListAggregateCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult) {
        this.compliancePacksResult = compliancePacksResult;
        return this;
    }
    public ListAggregateCompliancePacksResponseBodyCompliancePacksResult getCompliancePacksResult() {
        return this.compliancePacksResult;
    }

    public ListAggregateCompliancePacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks extends TeaModel {
        /**
         * <p>The ID of the management account to which the compliance package belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

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
         * <p>The ID of the compliance package template.</p>
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
         * <p>*   ACTIVE: The compliance package is available for use.</p>
         * <p>*   CREATING: The compliance package is being created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks self = new ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks();
            return TeaModel.build(map, self);
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAggregateCompliancePacksResponseBodyCompliancePacksResult extends TeaModel {
        /**
         * <p>The details of the compliance package.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks;

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

        public static ListAggregateCompliancePacksResponseBodyCompliancePacksResult build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateCompliancePacksResponseBodyCompliancePacksResult self = new ListAggregateCompliancePacksResponseBodyCompliancePacksResult();
            return TeaModel.build(map, self);
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResult setCompliancePacks(java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks) {
            this.compliancePacks = compliancePacks;
            return this;
        }
        public java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> getCompliancePacks() {
            return this.compliancePacks;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
