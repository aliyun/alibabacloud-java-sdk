// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFilteringAlgorithmsResponseBody extends TeaModel {
    @NameInMap("headers")
    public ListFilteringAlgorithmsResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>7585C2B2-0D61-4C96-AC5D-B960BFEDD4A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListFilteringAlgorithmsResponseBodyResult> result;

    public static ListFilteringAlgorithmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFilteringAlgorithmsResponseBody self = new ListFilteringAlgorithmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFilteringAlgorithmsResponseBody setHeaders(ListFilteringAlgorithmsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListFilteringAlgorithmsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListFilteringAlgorithmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFilteringAlgorithmsResponseBody setResult(java.util.List<ListFilteringAlgorithmsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFilteringAlgorithmsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListFilteringAlgorithmsResponseBodyHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListFilteringAlgorithmsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListFilteringAlgorithmsResponseBodyHeaders self = new ListFilteringAlgorithmsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListFilteringAlgorithmsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListFilteringAlgorithmsResponseBodyResultMetaExtInfo extends TeaModel {
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

        public static ListFilteringAlgorithmsResponseBodyResultMetaExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFilteringAlgorithmsResponseBodyResultMetaExtInfo self = new ListFilteringAlgorithmsResponseBodyResultMetaExtInfo();
            return TeaModel.build(map, self);
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaExtInfo setItemSeparator(String itemSeparator) {
            this.itemSeparator = itemSeparator;
            return this;
        }
        public String getItemSeparator() {
            return this.itemSeparator;
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaExtInfo setKvSeparator(String kvSeparator) {
            this.kvSeparator = kvSeparator;
            return this;
        }
        public String getKvSeparator() {
            return this.kvSeparator;
        }

    }

    public static class ListFilteringAlgorithmsResponseBodyResultMetaThreshold extends TeaModel {
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

        public static ListFilteringAlgorithmsResponseBodyResultMetaThreshold build(java.util.Map<String, ?> map) throws Exception {
            ListFilteringAlgorithmsResponseBodyResultMetaThreshold self = new ListFilteringAlgorithmsResponseBodyResultMetaThreshold();
            return TeaModel.build(map, self);
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold setIndexLossThreshold(Integer indexLossThreshold) {
            this.indexLossThreshold = indexLossThreshold;
            return this;
        }
        public Integer getIndexLossThreshold() {
            return this.indexLossThreshold;
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold setIndexSizeThreshold(Integer indexSizeThreshold) {
            this.indexSizeThreshold = indexSizeThreshold;
            return this;
        }
        public Integer getIndexSizeThreshold() {
            return this.indexSizeThreshold;
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
            this.sourceDataRecordThreshold = sourceDataRecordThreshold;
            return this;
        }
        public Integer getSourceDataRecordThreshold() {
            return this.sourceDataRecordThreshold;
        }

        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
            this.sourceDataSizeThreshold = sourceDataSizeThreshold;
            return this;
        }
        public Integer getSourceDataSizeThreshold() {
            return this.sourceDataSizeThreshold;
        }

    }

    public static class ListFilteringAlgorithmsResponseBodyResultMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("algorithmName")
        public String algorithmName;

        /**
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>0 0/12 0 * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cronEnabled")
        public Boolean cronEnabled;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("extInfo")
        public ListFilteringAlgorithmsResponseBodyResultMetaExtInfo extInfo;

        /**
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>airec123</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("threshold")
        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold threshold;

        /**
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static ListFilteringAlgorithmsResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListFilteringAlgorithmsResponseBodyResultMeta self = new ListFilteringAlgorithmsResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setCronEnabled(Boolean cronEnabled) {
            this.cronEnabled = cronEnabled;
            return this;
        }
        public Boolean getCronEnabled() {
            return this.cronEnabled;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setExtInfo(ListFilteringAlgorithmsResponseBodyResultMetaExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public ListFilteringAlgorithmsResponseBodyResultMetaExtInfo getExtInfo() {
            return this.extInfo;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setThreshold(ListFilteringAlgorithmsResponseBodyResultMetaThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public ListFilteringAlgorithmsResponseBodyResultMetaThreshold getThreshold() {
            return this.threshold;
        }

        public ListFilteringAlgorithmsResponseBodyResultMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFilteringAlgorithmsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
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
        public ListFilteringAlgorithmsResponseBodyResultMeta meta;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListFilteringAlgorithmsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFilteringAlgorithmsResponseBodyResult self = new ListFilteringAlgorithmsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFilteringAlgorithmsResponseBodyResult setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListFilteringAlgorithmsResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFilteringAlgorithmsResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFilteringAlgorithmsResponseBodyResult setMeta(ListFilteringAlgorithmsResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListFilteringAlgorithmsResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ListFilteringAlgorithmsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
