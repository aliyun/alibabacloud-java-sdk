// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntityItemsResponseBody extends TeaModel {
    // 表格数据元素数组
    @NameInMap("EntityItems")
    public java.util.List<ListEntityItemsResponseBodyEntityItems> entityItems;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求的最大结果数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 下次查询的起始Token
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回总个数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEntityItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntityItemsResponseBody self = new ListEntityItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntityItemsResponseBody setEntityItems(java.util.List<ListEntityItemsResponseBodyEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<ListEntityItemsResponseBodyEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public ListEntityItemsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListEntityItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEntityItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntityItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEntityItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEntityItemsResponseBodyEntityItems extends TeaModel {
        // 数据元素属性
        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        // 表格数据元素名称
        @NameInMap("EntityName")
        public String entityName;

        public static ListEntityItemsResponseBodyEntityItems build(java.util.Map<String, ?> map) throws Exception {
            ListEntityItemsResponseBodyEntityItems self = new ListEntityItemsResponseBodyEntityItems();
            return TeaModel.build(map, self);
        }

        public ListEntityItemsResponseBodyEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

        public ListEntityItemsResponseBodyEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
