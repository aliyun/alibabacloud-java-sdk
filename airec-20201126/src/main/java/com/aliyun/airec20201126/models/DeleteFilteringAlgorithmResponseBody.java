// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteFilteringAlgorithmResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>936BE457-5D14-4DBD-85AE-176F7BA8D96D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public DeleteFilteringAlgorithmResponseBodyResult result;

    public static DeleteFilteringAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilteringAlgorithmResponseBody self = new DeleteFilteringAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilteringAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFilteringAlgorithmResponseBody setResult(DeleteFilteringAlgorithmResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteFilteringAlgorithmResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo extends TeaModel {
        /**
         * <p>The delimiter that is used to separate items.</p>
         * 
         * <strong>example:</strong>
         * <p>;</p>
         */
        @NameInMap("itemSeparator")
        public String itemSeparator;

        /**
         * <p>The delimiter that is used to separate keys and values.</p>
         * 
         * <strong>example:</strong>
         * <p>;</p>
         */
        @NameInMap("kvSeparator")
        public String kvSeparator;

        public static DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo self = new DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo();
            return TeaModel.build(map, self);
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo setItemSeparator(String itemSeparator) {
            this.itemSeparator = itemSeparator;
            return this;
        }
        public String getItemSeparator() {
            return this.itemSeparator;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo setKvSeparator(String kvSeparator) {
            this.kvSeparator = kvSeparator;
            return this;
        }
        public String getKvSeparator() {
            return this.kvSeparator;
        }

    }

    public static class DeleteFilteringAlgorithmResponseBodyResultMetaThreshold extends TeaModel {
        /**
         * <p>The fluctuation threshold for the loss of the index data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexLossThreshold")
        public Integer indexLossThreshold;

        /**
         * <p>The fluctuation threshold for the size of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexSizeThreshold")
        public Integer indexSizeThreshold;

        /**
         * <p>The fluctuation threshold for the data entries in the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataRecordThreshold")
        public Integer sourceDataRecordThreshold;

        /**
         * <p>The fluctuation threshold for the size of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataSizeThreshold")
        public Integer sourceDataSizeThreshold;

        public static DeleteFilteringAlgorithmResponseBodyResultMetaThreshold build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilteringAlgorithmResponseBodyResultMetaThreshold self = new DeleteFilteringAlgorithmResponseBodyResultMetaThreshold();
            return TeaModel.build(map, self);
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold setIndexLossThreshold(Integer indexLossThreshold) {
            this.indexLossThreshold = indexLossThreshold;
            return this;
        }
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold setIndexSizeThreshold(Integer indexSizeThreshold) {
            this.indexSizeThreshold = indexSizeThreshold;
            return this;
        }
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
            this.sourceDataRecordThreshold = sourceDataRecordThreshold;
            return this;
        }
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
            this.sourceDataSizeThreshold = sourceDataSizeThreshold;
            return this;
        }
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

    }

    public static class DeleteFilteringAlgorithmResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The name of the filtering algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("algorithmName")
        public String algorithmName;

        /**
         * <p>The category of the filtering algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>i2i</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The CRON expression of the scheduled task. Example: 0 0/12 0 \* \*. The value indicates that the task is scheduled at 00:00 and 12:00 every day.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0/12 0 * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>N/A</p>
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
         * <p>Training task</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("extInfo")
        public DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo extInfo;

        /**
         * <p>The type of the metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>name01</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table01</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The threshold.</p>
         */
        @NameInMap("threshold")
        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold threshold;

        /**
         * <p>The type of the data source. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static DeleteFilteringAlgorithmResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilteringAlgorithmResponseBodyResultMeta self = new DeleteFilteringAlgorithmResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setCronEnabled(Boolean cronEnabled) {
            this.cronEnabled = cronEnabled;
            return this;
        }
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setExtInfo(DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public DeleteFilteringAlgorithmResponseBodyResultMetaExtInfo getExtInfo() {
            return this.extInfo;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setThreshold(DeleteFilteringAlgorithmResponseBodyResultMetaThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public DeleteFilteringAlgorithmResponseBodyResultMetaThreshold getThreshold() {
            return this.threshold;
        }

        public DeleteFilteringAlgorithmResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DeleteFilteringAlgorithmResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the specified filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("algorithmId")
        public String algorithmId;

        /**
         * <p>The time when the filtering table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the filtering table was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The metadata of the filtering table.</p>
         */
        @NameInMap("meta")
        public DeleteFilteringAlgorithmResponseBodyResultMeta meta;

        /**
         * <p>The state of the filtering table. Valid values: Draft, Running, Offline, and Deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static DeleteFilteringAlgorithmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilteringAlgorithmResponseBodyResult self = new DeleteFilteringAlgorithmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteFilteringAlgorithmResponseBodyResult setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public DeleteFilteringAlgorithmResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteFilteringAlgorithmResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteFilteringAlgorithmResponseBodyResult setMeta(DeleteFilteringAlgorithmResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public DeleteFilteringAlgorithmResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public DeleteFilteringAlgorithmResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
