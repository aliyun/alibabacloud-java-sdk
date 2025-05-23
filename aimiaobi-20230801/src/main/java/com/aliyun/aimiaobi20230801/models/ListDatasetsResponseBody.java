// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CustomSemanticSearchConfig")
    public ListDatasetsResponseBodyCustomSemanticSearchConfig customSemanticSearchConfig;

    @NameInMap("Data")
    public java.util.List<ListDatasetsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ThirdSearchConfig")
    public ListDatasetsResponseBodyThirdSearchConfig thirdSearchConfig;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDatasetsResponseBody setCustomSemanticSearchConfig(ListDatasetsResponseBodyCustomSemanticSearchConfig customSemanticSearchConfig) {
        this.customSemanticSearchConfig = customSemanticSearchConfig;
        return this;
    }
    public ListDatasetsResponseBodyCustomSemanticSearchConfig getCustomSemanticSearchConfig() {
        return this.customSemanticSearchConfig;
    }

    public ListDatasetsResponseBody setData(java.util.List<ListDatasetsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDatasetsResponseBodyData> getData() {
        return this.data;
    }

    public ListDatasetsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDatasetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatasetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDatasetsResponseBody setThirdSearchConfig(ListDatasetsResponseBodyThirdSearchConfig thirdSearchConfig) {
        this.thirdSearchConfig = thirdSearchConfig;
        return this;
    }
    public ListDatasetsResponseBodyThirdSearchConfig getThirdSearchConfig() {
        return this.thirdSearchConfig;
    }

    public ListDatasetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatasetsResponseBodyCustomSemanticSearchConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatasetQuota")
        public Integer datasetQuota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasetUsedQuota")
        public Integer datasetUsedQuota;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("DocQuota")
        public Long docQuota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocUsedQuota")
        public Long docUsedQuota;

        public static ListDatasetsResponseBodyCustomSemanticSearchConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyCustomSemanticSearchConfig self = new ListDatasetsResponseBodyCustomSemanticSearchConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyCustomSemanticSearchConfig setDatasetQuota(Integer datasetQuota) {
            this.datasetQuota = datasetQuota;
            return this;
        }
        public Integer getDatasetQuota() {
            return this.datasetQuota;
        }

        public ListDatasetsResponseBodyCustomSemanticSearchConfig setDatasetUsedQuota(Integer datasetUsedQuota) {
            this.datasetUsedQuota = datasetUsedQuota;
            return this;
        }
        public Integer getDatasetUsedQuota() {
            return this.datasetUsedQuota;
        }

        public ListDatasetsResponseBodyCustomSemanticSearchConfig setDocQuota(Long docQuota) {
            this.docQuota = docQuota;
            return this;
        }
        public Long getDocQuota() {
            return this.docQuota;
        }

        public ListDatasetsResponseBodyCustomSemanticSearchConfig setDocUsedQuota(Long docUsedQuota) {
            this.docUsedQuota = docUsedQuota;
            return this;
        }
        public Long getDocUsedQuota() {
            return this.docUsedQuota;
        }

    }

    public static class ListDatasetsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-11-12 21:46:24</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetDescription")
        public String datasetDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasetId")
        public Long datasetId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>CustomSemanticSearch</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocUsedQuota")
        public Long docUsedQuota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SearchDatasetEnable")
        public Integer searchDatasetEnable;

        public static ListDatasetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyData self = new ListDatasetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDatasetsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDatasetsResponseBodyData setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        public ListDatasetsResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public ListDatasetsResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListDatasetsResponseBodyData setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public ListDatasetsResponseBodyData setDocUsedQuota(Long docUsedQuota) {
            this.docUsedQuota = docUsedQuota;
            return this;
        }
        public Long getDocUsedQuota() {
            return this.docUsedQuota;
        }

        public ListDatasetsResponseBodyData setSearchDatasetEnable(Integer searchDatasetEnable) {
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

    }

    public static class ListDatasetsResponseBodyThirdSearchConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatasetQuota")
        public Integer datasetQuota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasetUsedQuota")
        public Integer datasetUsedQuota;

        public static ListDatasetsResponseBodyThirdSearchConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyThirdSearchConfig self = new ListDatasetsResponseBodyThirdSearchConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyThirdSearchConfig setDatasetQuota(Integer datasetQuota) {
            this.datasetQuota = datasetQuota;
            return this;
        }
        public Integer getDatasetQuota() {
            return this.datasetQuota;
        }

        public ListDatasetsResponseBodyThirdSearchConfig setDatasetUsedQuota(Integer datasetUsedQuota) {
            this.datasetUsedQuota = datasetUsedQuota;
            return this;
        }
        public Integer getDatasetUsedQuota() {
            return this.datasetUsedQuota;
        }

    }

}
