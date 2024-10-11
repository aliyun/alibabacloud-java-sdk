// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeFilteringAlgorithmResponseBody extends TeaModel {
    /**
     * <p>The metadata of the filtering table.</p>
     * 
     * <strong>example:</strong>
     * <p>7585C2B2-0D61-4C96-AC5D-B960BFEDD4A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("result")
    public DescribeFilteringAlgorithmResponseBodyResult result;

    public static DescribeFilteringAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilteringAlgorithmResponseBody self = new DescribeFilteringAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilteringAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFilteringAlgorithmResponseBody setResult(DescribeFilteringAlgorithmResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFilteringAlgorithmResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo extends TeaModel {
        /**
         * <p>The description of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("itemSeparator")
        public String itemSeparator;

        /**
         * <p>The fluctuation threshold for the size of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>:</p>
         */
        @NameInMap("kvSeparator")
        public String kvSeparator;

        public static DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo self = new DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo setItemSeparator(String itemSeparator) {
            this.itemSeparator = itemSeparator;
            return this;
        }
        public String getItemSeparator() {
            return this.itemSeparator;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo setKvSeparator(String kvSeparator) {
            this.kvSeparator = kvSeparator;
            return this;
        }
        public String getKvSeparator() {
            return this.kvSeparator;
        }

    }

    public static class DescribeFilteringAlgorithmResponseBodyResultMetaThreshold extends TeaModel {
        /**
         * <p>The ID of the specified instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexLossThreshold")
        public Integer indexLossThreshold;

        /**
         * <p>Queries specific configuration information about a filtering table based on the ID of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexSizeThreshold")
        public Integer indexSizeThreshold;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataRecordThreshold")
        public Integer sourceDataRecordThreshold;

        /**
         * <p>The name of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataSizeThreshold")
        public Integer sourceDataSizeThreshold;

        public static DescribeFilteringAlgorithmResponseBodyResultMetaThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilteringAlgorithmResponseBodyResultMetaThreshold self = new DescribeFilteringAlgorithmResponseBodyResultMetaThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold setIndexLossThreshold(Integer indexLossThreshold) {
            this.indexLossThreshold = indexLossThreshold;
            return this;
        }
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold setIndexSizeThreshold(Integer indexSizeThreshold) {
            this.indexSizeThreshold = indexSizeThreshold;
            return this;
        }
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
            this.sourceDataRecordThreshold = sourceDataRecordThreshold;
            return this;
        }
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
            this.sourceDataSizeThreshold = sourceDataSizeThreshold;
            return this;
        }
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

    }

    public static class DescribeFilteringAlgorithmResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The time when the filtering table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("algorithmName")
        public String algorithmName;

        /**
         * <p>Indicates whether the scheduled task is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1_2</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>244</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The information about the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><ul>
         * <li>24 7 0</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The ID of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cronEnabled")
        public Boolean cronEnabled;

        /**
         * <p>The time when the filtering table was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("extInfo")
        public DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo extInfo;

        /**
         * <p>The information about the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>metaType</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <p>The status of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The ID of the specified filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The CRON expression of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>taskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The ID of the filtering table.</p>
         */
        @NameInMap("threshold")
        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold threshold;

        /**
         * <p>The metadata of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeFilteringAlgorithmResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilteringAlgorithmResponseBodyResultMeta self = new DescribeFilteringAlgorithmResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setCronEnabled(Boolean cronEnabled) {
            this.cronEnabled = cronEnabled;
            return this;
        }
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setExtInfo(DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public DescribeFilteringAlgorithmResponseBodyResultMetaExtInfo getExtInfo() {
            return this.extInfo;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setThreshold(DescribeFilteringAlgorithmResponseBodyResultMetaThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public DescribeFilteringAlgorithmResponseBodyResultMetaThreshold getThreshold() {
            return this.threshold;
        }

        public DescribeFilteringAlgorithmResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeFilteringAlgorithmResponseBodyResult extends TeaModel {
        /**
         * <p>The fluctuation threshold for the size of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("algorithmId")
        public String algorithmId;

        /**
         * <p>The category of the filtering table.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The time when the filtering table was modified.</p>
         */
        @NameInMap("meta")
        public DescribeFilteringAlgorithmResponseBodyResultMeta meta;

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>The threshold for the loss of the index data.</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeFilteringAlgorithmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilteringAlgorithmResponseBodyResult self = new DescribeFilteringAlgorithmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFilteringAlgorithmResponseBodyResult setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public DescribeFilteringAlgorithmResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeFilteringAlgorithmResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeFilteringAlgorithmResponseBodyResult setMeta(DescribeFilteringAlgorithmResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public DescribeFilteringAlgorithmResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public DescribeFilteringAlgorithmResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
