// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntitiesResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // 翻页Token
    @NameInMap("NextToken")
    public String nextToken;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 公共数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 该实体包含的所有类型
    @NameInMap("Entities")
    public java.util.List<ListPublicDatasetEntitiesResponseBodyEntities> entities;

    public static ListPublicDatasetEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntitiesResponseBody self = new ListPublicDatasetEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetEntitiesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListPublicDatasetEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicDatasetEntitiesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListPublicDatasetEntitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPublicDatasetEntitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublicDatasetEntitiesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListPublicDatasetEntitiesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListPublicDatasetEntitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetEntitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPublicDatasetEntitiesResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListPublicDatasetEntitiesResponseBody setEntities(java.util.List<ListPublicDatasetEntitiesResponseBodyEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<ListPublicDatasetEntitiesResponseBodyEntities> getEntities() {
        return this.entities;
    }

    public static class ListPublicDatasetEntitiesResponseBodyEntities extends TeaModel {
        // 实体类型
        @NameInMap("EntityType")
        public String entityType;

        public static ListPublicDatasetEntitiesResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            ListPublicDatasetEntitiesResponseBodyEntities self = new ListPublicDatasetEntitiesResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public ListPublicDatasetEntitiesResponseBodyEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
