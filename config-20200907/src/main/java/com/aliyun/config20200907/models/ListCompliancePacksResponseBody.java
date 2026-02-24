// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The query results for the compliance packs.</p>
     */
    @NameInMap("CompliancePacksResult")
    public ListCompliancePacksResponseBodyCompliancePacksResult compliancePacksResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
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

    public static class ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags extends TeaModel {
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

        public static ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags self = new ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags();
            return TeaModel.build(map, self);
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the compliance pack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the compliance pack.</p>
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
         * <p>1621325046000</p>
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
         * <li><p>1: high risk.</p>
         * </li>
         * <li><p>2: medium risk.</p>
         * </li>
         * <li><p>3: low risk.</p>
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
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> tags;

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

        public ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks setTags(java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacksTags> getTags() {
            return this.tags;
        }

    }

    public static class ListCompliancePacksResponseBodyCompliancePacksResult extends TeaModel {
        /**
         * <p>A list of compliance packs.</p>
         */
        @NameInMap("CompliancePacks")
        public java.util.List<ListCompliancePacksResponseBodyCompliancePacksResultCompliancePacks> compliancePacks;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
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
