// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatasetsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12103XXX46492139</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("DataTypeList")
    public String dataTypeListShrink;

    /**
     * <strong>example:</strong>
     * <p>test_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>251363</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StorageTypeList")
    public String storageTypeListShrink;

    public static ListDatasetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsShrinkRequest self = new ListDatasetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsShrinkRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListDatasetsShrinkRequest setDataTypeListShrink(String dataTypeListShrink) {
        this.dataTypeListShrink = dataTypeListShrink;
        return this;
    }
    public String getDataTypeListShrink() {
        return this.dataTypeListShrink;
    }

    public ListDatasetsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasetsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetsShrinkRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListDatasetsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDatasetsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetsShrinkRequest setStorageTypeListShrink(String storageTypeListShrink) {
        this.storageTypeListShrink = storageTypeListShrink;
        return this;
    }
    public String getStorageTypeListShrink() {
        return this.storageTypeListShrink;
    }

}
