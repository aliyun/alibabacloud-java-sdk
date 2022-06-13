// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListBatchOperateCardsTasksResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("BatchOperateCardsTasks")
    public java.util.List<ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks> batchOperateCardsTasks;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Status")
        public String status;

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
        // 资源一级ID
        @NameInMap("BatchOperateCardsTaskId")
        public String batchOperateCardsTaskId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectType")
        public String effectType;

        @NameInMap("IccidsOssFilePath")
        public String iccidsOssFilePath;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperateResultOssFilePath")
        public Boolean operateResultOssFilePath;

        // 创建时间
        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("Status")
        public String status;

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

        public ListBatchOperateCardsTasksResponseBodyBatchOperateCardsTasks setOperateResultOssFilePath(Boolean operateResultOssFilePath) {
            this.operateResultOssFilePath = operateResultOssFilePath;
            return this;
        }
        public Boolean getOperateResultOssFilePath() {
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
