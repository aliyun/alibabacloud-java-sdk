// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntityItemsResponseBody extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("EntityItems")
    public java.util.List<ListPublicDatasetEntityItemsResponseBodyEntityItems> entityItems;

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

    public static ListPublicDatasetEntityItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntityItemsResponseBody self = new ListPublicDatasetEntityItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetEntityItemsResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListPublicDatasetEntityItemsResponseBody setEntityItems(java.util.List<ListPublicDatasetEntityItemsResponseBodyEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<ListPublicDatasetEntityItemsResponseBodyEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public ListPublicDatasetEntityItemsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListPublicDatasetEntityItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetEntityItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetEntityItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicDatasetEntityItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicDatasetEntityItemsResponseBodyEntityItems extends TeaModel {
        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        @NameInMap("EntityName")
        public String entityName;

        public static ListPublicDatasetEntityItemsResponseBodyEntityItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublicDatasetEntityItemsResponseBodyEntityItems self = new ListPublicDatasetEntityItemsResponseBodyEntityItems();
            return TeaModel.build(map, self);
        }

        public ListPublicDatasetEntityItemsResponseBodyEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

        public ListPublicDatasetEntityItemsResponseBodyEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
