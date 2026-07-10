// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsRequest extends TeaModel {
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
    public java.util.List<String> dataAssetIds;

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
    public java.util.List<ListDataAssetsRequestTags> tags;

    public static ListDataAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsRequest self = new ListDataAssetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAssetsRequest setAssetDomainId(Long assetDomainId) {
        this.assetDomainId = assetDomainId;
        return this;
    }
    public Long getAssetDomainId() {
        return this.assetDomainId;
    }

    public ListDataAssetsRequest setCategoryUuid(String categoryUuid) {
        this.categoryUuid = categoryUuid;
        return this;
    }
    public String getCategoryUuid() {
        return this.categoryUuid;
    }

    public ListDataAssetsRequest setDataAssetIds(java.util.List<String> dataAssetIds) {
        this.dataAssetIds = dataAssetIds;
        return this;
    }
    public java.util.List<String> getDataAssetIds() {
        return this.dataAssetIds;
    }

    public ListDataAssetsRequest setDataAssetType(String dataAssetType) {
        this.dataAssetType = dataAssetType;
        return this;
    }
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    public ListDataAssetsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListDataAssetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataAssetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAssetsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataAssetsRequest setTags(java.util.List<ListDataAssetsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListDataAssetsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListDataAssetsRequestTags extends TeaModel {
        /**
         * <p>The custom tag key.</p>
         * <p>The tag key can be up to 64 characters in length, cannot start with <code>dw:</code>, and supports only letters, digits, and the following special characters: <code>-@#*&lt;&gt;|[]()+=&amp;%$!~</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataAssetsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetsRequestTags self = new ListDataAssetsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListDataAssetsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataAssetsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
