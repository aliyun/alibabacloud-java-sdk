// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntitiesResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Entities")
    public java.util.List<ListEntitiesResponseBodyEntities> entities;

    public static ListEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesResponseBody self = new ListEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntitiesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEntitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEntitiesResponseBody setEntities(java.util.List<ListEntitiesResponseBodyEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<ListEntitiesResponseBodyEntities> getEntities() {
        return this.entities;
    }

    public static class ListEntitiesResponseBodyEntities extends TeaModel {
        // 实体类型
        @NameInMap("EntityType")
        public String entityType;

        public static ListEntitiesResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesResponseBodyEntities self = new ListEntitiesResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public ListEntitiesResponseBodyEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
