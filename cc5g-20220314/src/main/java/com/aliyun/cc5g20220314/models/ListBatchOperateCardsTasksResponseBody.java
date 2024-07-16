// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListBatchOperateCardsTasksResponseBody extends TeaModel {
    @NameInMap("BatchOperateCardsTasks")
    public java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks> batchOperateCardsTasks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListBatchOperateCardsTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchOperateCardsTasksResponseBody self = new ListBatchOperateCardsTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchOperateCardsTasksResponseBody setBatchOperateCardsTasks(java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks> batchOperateCardsTasks) {
        this.batchOperateCardsTasks = batchOperateCardsTasks;
        return this;
    }
    public java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks> getBatchOperateCardsTasks() {
        return this.batchOperateCardsTasks;
    }

    public ListBatchOperateCardsTasksResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListBatchOperateCardsTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchOperateCardsTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchOperateCardsTasksResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cc5g-xxxx</p>
         */
        @NameInMap("WirelessCloudConnectorId")
        public String wirelessCloudConnectorId;

        public static ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors self = new ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

    }

    public static class ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>boct-xxxx</p>
         */
        @NameInMap("BatchOperateCardsTaskId")
        public String batchOperateCardsTaskId;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 22:20:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>task-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>CurrentMonth</p>
         */
        @NameInMap("EffectType")
        public String effectType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://examplebucket.oss-eu-central-1.aliyuncs.com/">https://examplebucket.oss-eu-central-1.aliyuncs.com/</a>***</p>
         */
        @NameInMap("IccidsOssFilePath")
        public String iccidsOssFilePath;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="https://examplebucket.oss-eu-central-1.aliyuncs.com/">https://examplebucket.oss-eu-central-1.aliyuncs.com/</a>***</p>
         */
        @NameInMap("OperateResultOssFilePath")
        public String operateResultOssFilePath;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>BreakNetwork</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("WirelessCloudConnectors")
        public java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors> wirelessCloudConnectors;

        public static ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks build(java.util.Map<String, ?> map) throws Exception {
            ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks self = new ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks();
            return TeaModel.build(map, self);
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
            this.batchOperateCardsTaskId = batchOperateCardsTaskId;
            return this;
        }
        public String getBatchOperateCardsTaskId() {
            return this.batchOperateCardsTaskId;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setEffectType(String effectType) {
            this.effectType = effectType;
            return this;
        }
        public String getEffectType() {
            return this.effectType;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setIccidsOssFilePath(String iccidsOssFilePath) {
            this.iccidsOssFilePath = iccidsOssFilePath;
            return this;
        }
        public String getIccidsOssFilePath() {
            return this.iccidsOssFilePath;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setOperateResultOssFilePath(String operateResultOssFilePath) {
            this.operateResultOssFilePath = operateResultOssFilePath;
            return this;
        }
        public String getOperateResultOssFilePath() {
            return this.operateResultOssFilePath;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setWirelessCloudConnectors(java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors> wirelessCloudConnectors) {
            this.wirelessCloudConnectors = wirelessCloudConnectors;
            return this;
        }
        public java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasksWirelessCloudConnectors> getWirelessCloudConnectors() {
            return this.wirelessCloudConnectors;
        }

    }

}
