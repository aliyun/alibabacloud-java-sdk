// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFilteringAlgorithmMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7585C2B2-0D61-4C96-AC5D-B960BFEDD4A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ModifyFilteringAlgorithmMetaResponseBodyResult result;

    public static ModifyFilteringAlgorithmMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFilteringAlgorithmMetaResponseBody self = new ModifyFilteringAlgorithmMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFilteringAlgorithmMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFilteringAlgorithmMetaResponseBody setResult(ModifyFilteringAlgorithmMetaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyFilteringAlgorithmMetaResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("itemSeparator")
        public String itemSeparator;

        /**
         * <strong>example:</strong>
         * <p>:</p>
         */
        @NameInMap("kvSeparator")
        public String kvSeparator;

        public static ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo self = new ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo();
            return TeaModel.build(map, self);
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo setItemSeparator(String itemSeparator) {
            this.itemSeparator = itemSeparator;
            return this;
        }
        public String getItemSeparator() {
            return this.itemSeparator;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo setKvSeparator(String kvSeparator) {
            this.kvSeparator = kvSeparator;
            return this;
        }
        public String getKvSeparator() {
            return this.kvSeparator;
        }

    }

    public static class ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexLossThreshold")
        public Integer indexLossThreshold;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("indexSizeThreshold")
        public Integer indexSizeThreshold;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataRecordThreshold")
        public Integer sourceDataRecordThreshold;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceDataSizeThreshold")
        public Integer sourceDataSizeThreshold;

        public static ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold build(java.util.Map<String, ?> map) throws Exception {
            ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold self = new ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold();
            return TeaModel.build(map, self);
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold setIndexLossThreshold(Integer indexLossThreshold) {
            this.indexLossThreshold = indexLossThreshold;
            return this;
        }
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold setIndexSizeThreshold(Integer indexSizeThreshold) {
            this.indexSizeThreshold = indexSizeThreshold;
            return this;
        }
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
            this.sourceDataRecordThreshold = sourceDataRecordThreshold;
            return this;
        }
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
            this.sourceDataSizeThreshold = sourceDataSizeThreshold;
            return this;
        }
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

    }

    public static class ModifyFilteringAlgorithmMetaResponseBodyResultMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("algorithmName")
        public String algorithmName;

        /**
         * <strong>example:</strong>
         * <p>1_2</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>244</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
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

        @NameInMap("cronEnabled")
        public Boolean cronEnabled;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("extInfo")
        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo extInfo;

        /**
         * <strong>example:</strong>
         * <p>metaType</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>taskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("threshold")
        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold threshold;

        /**
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyFilteringAlgorithmMetaResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyFilteringAlgorithmMetaResponseBodyResultMeta self = new ModifyFilteringAlgorithmMetaResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setCronEnabled(Boolean cronEnabled) {
            this.cronEnabled = cronEnabled;
            return this;
        }
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setExtInfo(ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaExtInfo getExtInfo() {
            return this.extInfo;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setThreshold(ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public ModifyFilteringAlgorithmMetaResponseBodyResultMetaThreshold getThreshold() {
            return this.threshold;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyFilteringAlgorithmMetaResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("algorithmId")
        public String algorithmId;

        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("meta")
        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta meta;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ModifyFilteringAlgorithmMetaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyFilteringAlgorithmMetaResponseBodyResult self = new ModifyFilteringAlgorithmMetaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResult setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResult setMeta(ModifyFilteringAlgorithmMetaResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ModifyFilteringAlgorithmMetaResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ModifyFilteringAlgorithmMetaResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
