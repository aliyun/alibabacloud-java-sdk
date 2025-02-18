// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TagDataAssetsRequest extends TeaModel {
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
    public java.util.List<String> dataAssetIds;

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
    public java.util.List<TagDataAssetsRequestTags> tags;

    public static TagDataAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        TagDataAssetsRequest self = new TagDataAssetsRequest();
        return TeaModel.build(map, self);
    }

    public TagDataAssetsRequest setAutoTraceEnabled(Boolean autoTraceEnabled) {
        this.autoTraceEnabled = autoTraceEnabled;
        return this;
    }
    public Boolean getAutoTraceEnabled() {
        return this.autoTraceEnabled;
    }

    public TagDataAssetsRequest setDataAssetIds(java.util.List<String> dataAssetIds) {
        this.dataAssetIds = dataAssetIds;
        return this;
    }
    public java.util.List<String> getDataAssetIds() {
        return this.dataAssetIds;
    }

    public TagDataAssetsRequest setDataAssetType(String dataAssetType) {
        this.dataAssetType = dataAssetType;
        return this;
    }
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    public TagDataAssetsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public TagDataAssetsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TagDataAssetsRequest setTags(java.util.List<TagDataAssetsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagDataAssetsRequestTags> getTags() {
        return this.tags;
    }

    public static class TagDataAssetsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
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

        public static TagDataAssetsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagDataAssetsRequestTags self = new TagDataAssetsRequestTags();
            return TeaModel.build(map, self);
        }

        public TagDataAssetsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagDataAssetsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
