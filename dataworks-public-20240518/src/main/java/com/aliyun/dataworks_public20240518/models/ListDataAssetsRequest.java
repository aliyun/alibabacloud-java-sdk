// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsRequest extends TeaModel {
    @NameInMap("DataAssetIds")
    public java.util.List<String> dataAssetIds;

    /**
     * <strong>example:</strong>
     * <p>ACS::DataWorks::Task</p>
     */
    @NameInMap("DataAssetType")
    public String dataAssetType;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

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
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListDataAssetsRequestTags> tags;

    public static ListDataAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsRequest self = new ListDataAssetsRequest();
        return TeaModel.build(map, self);
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
