// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntitiesResponseBody extends TeaModel {
    // 公共数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 该实体包含的所有类型
    @NameInMap("Entities")
    public java.util.List<ListPublicDatasetEntitiesResponseBodyEntities> entities;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicDatasetEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntitiesResponseBody self = new ListPublicDatasetEntitiesResponseBody();
        return TeaModel.build(map, self);
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

    public ListPublicDatasetEntitiesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListPublicDatasetEntitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetEntitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicDatasetEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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
