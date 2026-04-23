// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchInventoryKnowledgeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>订单</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ShowType")
    public String showType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>confidence</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static SearchInventoryKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryKnowledgeRequest self = new SearchInventoryKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public SearchInventoryKnowledgeRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SearchInventoryKnowledgeRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public SearchInventoryKnowledgeRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchInventoryKnowledgeRequest setShowType(String showType) {
        this.showType = showType;
        return this;
    }
    public String getShowType() {
        return this.showType;
    }

    public SearchInventoryKnowledgeRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchInventoryKnowledgeRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchInventoryKnowledgeRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
