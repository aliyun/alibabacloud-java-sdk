// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12103XXX46492139</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("DataTypeList")
    public java.util.List<String> dataTypeList;

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
    public java.util.List<String> storageTypeList;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListDatasetsRequest setDataTypeList(java.util.List<String> dataTypeList) {
        this.dataTypeList = dataTypeList;
        return this;
    }
    public java.util.List<String> getDataTypeList() {
        return this.dataTypeList;
    }

    public ListDatasetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasetsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListDatasetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDatasetsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetsRequest setStorageTypeList(java.util.List<String> storageTypeList) {
        this.storageTypeList = storageTypeList;
        return this;
    }
    public java.util.List<String> getStorageTypeList() {
        return this.storageTypeList;
    }

}
