// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("AssetDomainId")
    public Long assetDomainId;

    /**
     * <strong>example:</strong>
     * <p>cate-xxxxxxxx</p>
     */
    @NameInMap("CategoryUuid")
    public String categoryUuid;

    /**
     * <p>The list of unique data asset IDs.</p>
     */
    @NameInMap("DataAssetIds")
    public String dataAssetIdsShrink;

    /**
     * <p>The Asset Type of the data asset. Valid values:</p>
     * <ul>
     * <li><p>ACS::DataWorks::Table: table.</p>
     * </li>
     * <li><p>ACS::DataWorks::Task: scheduling node.</p>
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
     * <li>Dev: development environment.</li>
     * <li>Prod: production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <strong>example:</strong>
     * <p>资产域名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of tags associated with data assets. Tags are used as query filters:</p>
     * <ul>
     * <li>Multiple values have an OR relationship. For example, <code>[&quot;key1:v1&quot;, &quot;key2:v1&quot;, &quot;key3:v1&quot;]</code> queries data assets that contain any of the specified tags.</li>
     * <li>If this parameter is not specified or is left empty, no tag-based filtering is applied.</li>
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
