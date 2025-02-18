// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsShrinkRequest extends TeaModel {
    /**
     * <p>The data asset IDs.</p>
     */
    @NameInMap("DataAssetIds")
    public String dataAssetIdsShrink;

    /**
     * <p>The type of the data asset. Valid values:</p>
     * <ul>
     * <li>ACS::DataWorks::Table</li>
     * <li>ACS::DataWorks::Task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACS::DataWorks::Task</p>
     */
    @NameInMap("DataAssetType")
    public String dataAssetType;

    /**
     * <p>The environment of the workspace to which the data asset belongs. Valid values:</p>
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
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tags that are added to data assets. This parameter specifies a filter condition.</p>
     * <ul>
     * <li>You can specify multiple tags, which are in the logical OR relation. For example, you can query the data assets that contain one of the following tags: <code>[&quot;key1:v1&quot;, &quot;key2:v1&quot;, &quot;key3:v1&quot;]</code>.</li>
     * <li>If you do not configure this parameter, tag-based filtering is not performed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListDataAssetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsShrinkRequest self = new ListDataAssetsShrinkRequest();
        return TeaModel.build(map, self);
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
