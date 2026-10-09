// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the asset domain.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("AssetDomainId")
    public Long assetDomainId;

    /**
     * <p>The ID of the asset category.</p>
     * 
     * <strong>example:</strong>
     * <p>cate-xxxxxxxx</p>
     */
    @NameInMap("CategoryUuid")
    public String categoryUuid;

    /**
     * <p>The list of unique IDs of the data assets.</p>
     */
    @NameInMap("DataAssetIds")
    public String dataAssetIdsShrink;

    /**
     * <p>The asset type of the data asset.</p>
     * <ul>
     * <li><p>DataWorks table (ACS::DataWorks::Table)</p>
     * </li>
     * <li><p>DataWorks scheduling node (ACS::DataWorks::Task)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACS::DataWorks::Task</p>
     */
    @NameInMap("DataAssetType")
    public String dataAssetType;

    /**
     * <p>The workspace environment to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li>Dev: development environment</li>
     * <li>Prod: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the asset. Fuzzy search by name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Asset domain name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of tags associated with the data assets. This parameter is used to filter query results based on tags:</p>
     * <ul>
     * <li>Multiple values are evaluated with an OR logical operator. For example, if you specify <code>[&quot;key1:v1&quot;, &quot;key2:v1&quot;, &quot;key3:v1&quot;]</code>, the system queries data assets that contain at least one of the specified tags.</li>
     * <li>If this parameter is not specified or is left empty, no tag-based filtering is performed.</li>
     * </ul>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListDataAssetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsShrinkRequest self = new ListDataAssetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAssetsShrinkRequest setAssetDomainId(Long assetDomainId) {
        this.assetDomainId = assetDomainId;
        return this;
    }
    public Long getAssetDomainId() {
        return this.assetDomainId;
    }

    public ListDataAssetsShrinkRequest setCategoryUuid(String categoryUuid) {
        this.categoryUuid = categoryUuid;
        return this;
    }
    public String getCategoryUuid() {
        return this.categoryUuid;
    }

    public ListDataAssetsShrinkRequest setDataAssetIdsShrink(String dataAssetIdsShrink) {
        this.dataAssetIdsShrink = dataAssetIdsShrink;
        return this;
    }
    public String getDataAssetIdsShrink() {
        return this.dataAssetIdsShrink;
    }

    public ListDataAssetsShrinkRequest setDataAssetType(String dataAssetType) {
        this.dataAssetType = dataAssetType;
        return this;
    }
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    public ListDataAssetsShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListDataAssetsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataAssetsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAssetsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAssetsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataAssetsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
