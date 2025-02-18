// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TagDataAssetsShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable lineage-based automatic backtracking.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoTraceEnabled")
    public Boolean autoTraceEnabled;

    /**
     * <p>The data asset IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataAssetIds")
    public String dataAssetIdsShrink;

    /**
     * <p>The type of the data asset. Valid values:</p>
     * <ul>
     * <li>ACS::DataWorks::Table</li>
     * <li>ACS::DataWorks::Task</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tags that you want to add to data assets.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static TagDataAssetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TagDataAssetsShrinkRequest self = new TagDataAssetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TagDataAssetsShrinkRequest setAutoTraceEnabled(Boolean autoTraceEnabled) {
        this.autoTraceEnabled = autoTraceEnabled;
        return this;
    }
    public Boolean getAutoTraceEnabled() {
        return this.autoTraceEnabled;
    }

    public TagDataAssetsShrinkRequest setDataAssetIdsShrink(String dataAssetIdsShrink) {
        this.dataAssetIdsShrink = dataAssetIdsShrink;
        return this;
    }
    public String getDataAssetIdsShrink() {
        return this.dataAssetIdsShrink;
    }

    public TagDataAssetsShrinkRequest setDataAssetType(String dataAssetType) {
        this.dataAssetType = dataAssetType;
        return this;
    }
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    public TagDataAssetsShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public TagDataAssetsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TagDataAssetsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
