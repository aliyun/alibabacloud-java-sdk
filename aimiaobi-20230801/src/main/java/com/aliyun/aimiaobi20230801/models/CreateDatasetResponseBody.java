// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDatasetResponseBodyData data;

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

    public static CreateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponseBody self = new CreateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDatasetResponseBody setData(CreateDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDatasetResponseBodyData getData() {
        return this.data;
    }

    public CreateDatasetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDatasetResponseBodyData extends TeaModel {
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
        @NameInMap("SearchDatasetEnable")
        public Integer searchDatasetEnable;

        public static CreateDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetResponseBodyData self = new CreateDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDatasetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateDatasetResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public CreateDatasetResponseBodyData setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        public CreateDatasetResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public CreateDatasetResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public CreateDatasetResponseBodyData setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public CreateDatasetResponseBodyData setSearchDatasetEnable(Integer searchDatasetEnable) {
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

    }

}
