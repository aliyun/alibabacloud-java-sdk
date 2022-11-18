// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntitiesResponseBody extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Entities")
    public java.util.List<ListPublicDatasetEntitiesResponseBodyEntities> entities;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
