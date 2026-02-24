// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The results of the query.</p>
     */
    @NameInMap("CompliancePacksResult")
    public ListAggregateCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B5806142-3090-4F86-A84E-12B3FE52C1C4</p>
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

    public static class ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags self = new ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags();
            return TeaModel.build(map, self);
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks extends TeaModel {
        /**
         * <p>The ID of the management account to which the compliance pack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The compliance pack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>BestPracticesForResourceStability</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the compliance pack template.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-484cff4e06a30062****</p>
         */
        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        /**
         * <p>The timestamp when the compliance pack was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624243657000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the stability of Alibaba Cloud resources based on the high-availability infrastructure, capacity protection, change management, monitoring management, backup management, and fault isolation. This helps you identify issues at the earliest opportunity and improve stability and the efficiency of O&amp;M.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the compliance pack. Valid values:</p>
         * <ul>
         * <li><p>1: high</p>
         * </li>
         * <li><p>2: medium</p>
         * </li>
         * <li><p>3: low</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The status of the compliance pack. Valid values:</p>
         * <ul>
         * <li><p>ACTIVE: The compliance pack is active.</p>
         * </li>
         * <li><p>CREATING: The compliance pack is being created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag of the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> tags;

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

        public ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setTags(java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> getTags() {
            return this.tags;
        }

    }

    public static class ListAggregateCompliancePacksResponseBodyCompliancePacksResult extends TeaModel {
        /**
         * <p>The compliance packs.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<ListAggregateCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compliance packs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
