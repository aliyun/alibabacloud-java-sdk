// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupDiscoverRulesPreview extends TeaModel {
    /**
     * <p>The global association catalog version used for this preview.</p>
     * 
     * <strong>example:</strong>
     * <p>03ac8b5b92cb9c2675119d64c31d2520c069647aa9b88979df1bb115472c02b4</p>
     */
    @NameInMap("catalogRevision")
    public String catalogRevision;

    /**
     * <p>The number of entities returned on this page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The primary entities, associated sub-entities, and total count by entity type.</p>
     */
    @NameInMap("entitySummaries")
    public java.util.List<ObserveGroupEntitySummary> entitySummaries;

    /**
     * <p>The total count after filtering by entity role, type, and keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("filteredCount")
    public Integer filteredCount;

    /**
     * <p>The list of matched entities on this page.</p>
     */
    @NameInMap("instances")
    public java.util.List<ObserveGroupInstance> instances;

    /**
     * <p>The deduplicated count of primary entities.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("mainCount")
    public Long mainCount;

    /**
     * <p>The maximum number of entities returned on this page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The next page token, which is empty if there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwLCJyZXF1ZXN0SGFzaCI6IjAzYWM4YjViOTJjYjljMjY3NTExOWQ2NGMzMWQyNTIwYzA2OTY0N2FhOWI4ODk3OWRmMWJiMTE1NDcyYzAyYjQifQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The deduplicated count of associated sub-entities.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("relatedCount")
    public Long relatedCount;

    /**
     * <p>The primary entities, associated sub-entities, and total count by rule.</p>
     */
    @NameInMap("ruleCounts")
    public java.util.List<ObserveGroupRuleCount> ruleCounts;

    /**
     * <p>The deduplicated total count of entities.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ObserveGroupDiscoverRulesPreview build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupDiscoverRulesPreview self = new ObserveGroupDiscoverRulesPreview();
        return TeaModel.build(map, self);
    }

    public ObserveGroupDiscoverRulesPreview setCatalogRevision(String catalogRevision) {
        this.catalogRevision = catalogRevision;
        return this;
    }
    public String getCatalogRevision() {
        return this.catalogRevision;
    }

    public ObserveGroupDiscoverRulesPreview setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ObserveGroupDiscoverRulesPreview setEntitySummaries(java.util.List<ObserveGroupEntitySummary> entitySummaries) {
        this.entitySummaries = entitySummaries;
        return this;
    }
    public java.util.List<ObserveGroupEntitySummary> getEntitySummaries() {
        return this.entitySummaries;
    }

    public ObserveGroupDiscoverRulesPreview setFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
        return this;
    }
    public Integer getFilteredCount() {
        return this.filteredCount;
    }

    public ObserveGroupDiscoverRulesPreview setInstances(java.util.List<ObserveGroupInstance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ObserveGroupInstance> getInstances() {
        return this.instances;
    }

    public ObserveGroupDiscoverRulesPreview setMainCount(Long mainCount) {
        this.mainCount = mainCount;
        return this;
    }
    public Long getMainCount() {
        return this.mainCount;
    }

    public ObserveGroupDiscoverRulesPreview setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ObserveGroupDiscoverRulesPreview setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ObserveGroupDiscoverRulesPreview setRelatedCount(Long relatedCount) {
        this.relatedCount = relatedCount;
        return this;
    }
    public Long getRelatedCount() {
        return this.relatedCount;
    }

    public ObserveGroupDiscoverRulesPreview setRuleCounts(java.util.List<ObserveGroupRuleCount> ruleCounts) {
        this.ruleCounts = ruleCounts;
        return this;
    }
    public java.util.List<ObserveGroupRuleCount> getRuleCounts() {
        return this.ruleCounts;
    }

    public ObserveGroupDiscoverRulesPreview setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
