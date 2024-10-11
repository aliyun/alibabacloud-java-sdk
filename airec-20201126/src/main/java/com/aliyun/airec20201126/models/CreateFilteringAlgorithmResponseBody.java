// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateFilteringAlgorithmResponseBody extends TeaModel {
    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values: true: performs a dry run. false: performs a dry run and sends the request.</p>
     */
    @NameInMap("result")
    public CreateFilteringAlgorithmResponseBodyResult result;

    public static CreateFilteringAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFilteringAlgorithmResponseBody self = new CreateFilteringAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFilteringAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFilteringAlgorithmResponseBody setResult(CreateFilteringAlgorithmResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFilteringAlgorithmResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFilteringAlgorithmResponseBodyResultMetaThreshold extends TeaModel {
        /**
         * <p>The time when the filtering table was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexLossThreshold")
        public Integer indexLossThreshold;

        /**
         * <p>The fluctuation threshold for the size of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexSizeThreshold")
        public Integer indexSizeThreshold;

        /**
         * <p>The category of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataRecordThreshold")
        public Integer sourceDataRecordThreshold;

        /**
         * <p>The fluctuation threshold for the loss of the index data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataSizeThreshold")
        public Integer sourceDataSizeThreshold;

        public static CreateFilteringAlgorithmResponseBodyResultMetaThreshold build(java.util.Map<String, ?> map) throws Exception {
            CreateFilteringAlgorithmResponseBodyResultMetaThreshold self = new CreateFilteringAlgorithmResponseBodyResultMetaThreshold();
            return TeaModel.build(map, self);
        }

        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold setIndexLossThreshold(Integer indexLossThreshold) {
            this.indexLossThreshold = indexLossThreshold;
            return this;
        }
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold setIndexSizeThreshold(Integer indexSizeThreshold) {
            this.indexSizeThreshold = indexSizeThreshold;
            return this;
        }
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
            this.sourceDataRecordThreshold = sourceDataRecordThreshold;
            return this;
        }
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
            this.sourceDataSizeThreshold = sourceDataSizeThreshold;
            return this;
        }
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

    }

    public static class CreateFilteringAlgorithmResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The name of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>algorithmTest</p>
         */
        @NameInMap("algorithmName")
        public String algorithmName;

        /**
         * <p>The response body.</p>
         * 
         * <strong>example:</strong>
         * <p>1_2</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The fluctuation threshold for the size of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0/12 0 * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The time when the filtering table was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cronEnabled")
        public Boolean cronEnabled;

        /**
         * <p>The description of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <p>The information about the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>Indicates whether the scheduled task is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The CRON expression of the scheduled task. Example: 0 0/12 0 \* \*, which indicates that the task is scheduled at 00:00 and 12:00 every day.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The metadata of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_test</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>0 0/12 0 * *&quot;</p>
         */
        @NameInMap("threshold")
        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold threshold;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateFilteringAlgorithmResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateFilteringAlgorithmResponseBodyResultMeta self = new CreateFilteringAlgorithmResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setCronEnabled(Boolean cronEnabled) {
            this.cronEnabled = cronEnabled;
            return this;
        }
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setThreshold(CreateFilteringAlgorithmResponseBodyResultMetaThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public CreateFilteringAlgorithmResponseBodyResultMetaThreshold getThreshold() {
            return this.threshold;
        }

        public CreateFilteringAlgorithmResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateFilteringAlgorithmResponseBodyResult extends TeaModel {
        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("algorithmId")
        public String algorithmId;

        /**
         * <p>The time when the filtering table was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The fluctuation threshold for the data entries in the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The threshold.</p>
         */
        @NameInMap("meta")
        public CreateFilteringAlgorithmResponseBodyResultMeta meta;

        /**
         * <p>The name of the filtering algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateFilteringAlgorithmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFilteringAlgorithmResponseBodyResult self = new CreateFilteringAlgorithmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFilteringAlgorithmResponseBodyResult setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public CreateFilteringAlgorithmResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateFilteringAlgorithmResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateFilteringAlgorithmResponseBodyResult setMeta(CreateFilteringAlgorithmResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public CreateFilteringAlgorithmResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public CreateFilteringAlgorithmResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
