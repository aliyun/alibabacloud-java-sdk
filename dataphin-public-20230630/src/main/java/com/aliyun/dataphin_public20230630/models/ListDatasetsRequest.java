// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("DatasetQuery")
    public ListDatasetsRequestDatasetQuery datasetQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setDatasetQuery(ListDatasetsRequestDatasetQuery datasetQuery) {
        this.datasetQuery = datasetQuery;
        return this;
    }
    public ListDatasetsRequestDatasetQuery getDatasetQuery() {
        return this.datasetQuery;
    }

    public ListDatasetsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListDatasetsRequestDatasetQuery extends TeaModel {
        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The data domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74280</p>
         */
        @NameInMap("DataUnit")
        public String dataUnit;

        /**
         * <p>Specifies whether to include version details. Default value: FALSE.</p>
         */
        @NameInMap("IncludeVersionList")
        public Boolean includeVersionList;

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7273382541481536</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The dataset scenario. Valid values:</p>
         * <ul>
         * <li>OFFLINE: offline.</li>
         * <li>REALTIME: real-time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The dataset type. If left empty, all types are queried.</p>
         */
        @NameInMap("TypeList")
        public java.util.List<String> typeList;

        public static ListDatasetsRequestDatasetQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsRequestDatasetQuery self = new ListDatasetsRequestDatasetQuery();
            return TeaModel.build(map, self);
        }

        public ListDatasetsRequestDatasetQuery setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListDatasetsRequestDatasetQuery setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public ListDatasetsRequestDatasetQuery setIncludeVersionList(Boolean includeVersionList) {
            this.includeVersionList = includeVersionList;
            return this;
        }
        public Boolean getIncludeVersionList() {
            return this.includeVersionList;
        }

        public ListDatasetsRequestDatasetQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDatasetsRequestDatasetQuery setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDatasetsRequestDatasetQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListDatasetsRequestDatasetQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDatasetsRequestDatasetQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDatasetsRequestDatasetQuery setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListDatasetsRequestDatasetQuery setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListDatasetsRequestDatasetQuery setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDatasetsRequestDatasetQuery setTypeList(java.util.List<String> typeList) {
            this.typeList = typeList;
            return this;
        }
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

    }

}
