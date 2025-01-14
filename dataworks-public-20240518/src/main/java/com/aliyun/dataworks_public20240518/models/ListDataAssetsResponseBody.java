// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDataAssetsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsResponseBody self = new ListDataAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAssetsResponseBody setPagingInfo(ListDataAssetsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataAssetsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings extends TeaModel {
        @NameInMap("AutoTraceEnabled")
        public Boolean autoTraceEnabled;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>7259557313</p>
         */
        @NameInMap("DataAssetId")
        public String dataAssetId;

        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>UserDefined</p>
         */
        @NameInMap("TagSource")
        public String tagSource;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings self = new ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings();
            return TeaModel.build(map, self);
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setAutoTraceEnabled(Boolean autoTraceEnabled) {
            this.autoTraceEnabled = autoTraceEnabled;
            return this;
        }
        public Boolean getAutoTraceEnabled() {
            return this.autoTraceEnabled;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setDataAssetId(String dataAssetId) {
            this.dataAssetId = dataAssetId;
            return this;
        }
        public String getDataAssetId() {
            return this.dataAssetId;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setTagSource(String tagSource) {
            this.tagSource = tagSource;
            return this;
        }
        public String getTagSource() {
            return this.tagSource;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataAssetsResponseBodyPagingInfoDataAssets extends TeaModel {
        @NameInMap("DataAssetTagMappings")
        public java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings> dataAssetTagMappings;

        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>7259557313</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>ali_cn_es_gfn</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>54275</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>ACS::DataWorks::Task</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataAssetsResponseBodyPagingInfoDataAssets build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetsResponseBodyPagingInfoDataAssets self = new ListDataAssetsResponseBodyPagingInfoDataAssets();
            return TeaModel.build(map, self);
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setDataAssetTagMappings(java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings> dataAssetTagMappings) {
            this.dataAssetTagMappings = dataAssetTagMappings;
            return this;
        }
        public java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssetsDataAssetTagMappings> getDataAssetTagMappings() {
            return this.dataAssetTagMappings;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataAssetsResponseBodyPagingInfoDataAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataAssetsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DataAssets")
        public java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssets> dataAssets;

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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataAssetsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetsResponseBodyPagingInfo self = new ListDataAssetsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataAssetsResponseBodyPagingInfo setDataAssets(java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssets> dataAssets) {
            this.dataAssets = dataAssets;
            return this;
        }
        public java.util.List<ListDataAssetsResponseBodyPagingInfoDataAssets> getDataAssets() {
            return this.dataAssets;
        }

        public ListDataAssetsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAssetsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataAssetsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
