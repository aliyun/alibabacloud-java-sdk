// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>The creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12103XXX46492139</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The data type. Multiple selections are allowed. Valid values:</p>
     * <ul>
     * <li>COMMON</li>
     * <li>PIC</li>
     * <li>TEXT</li>
     * <li>TABLE</li>
     * <li>VIDEO</li>
     * <li>AUDIO</li>
     * <li>INDEX</li>
     * </ul>
     */
    @NameInMap("DataTypeList")
    public java.util.List<String> dataTypeList;

    /**
     * <p>The dataset name. Supports fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>test_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default: Desc.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Asc: Ascending.</li>
     * <li>Desc: Descending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The dataset source. Valid values:</p>
     * <ul>
     * <li>DataWorks</li>
     * <li>PAI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>251363</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sort field. Default: CreateTime.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ModifyTime: Modification time.</li>
     * <li>CreateTime: Creation time.</li>
     * <li>Name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The storage type. Multiple selections are allowed. Supported values:</p>
     * <ul>
     * <li>OSS</li>
     * <li>NAS: General-purpose NAS file systems</li>
     * <li>EXTREMENAS: Extreme NAS file systems</li>
     * <li>DLF_LANCE: Data Lake Formation</li>
     * <li>CPFS: Cloud Parallel File Storage</li>
     * <li>BMCPFS: CPFS for Lingjun</li>
     * <li>MAXCOMPUTE: MaxCompute table</li>
     * </ul>
     */
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
