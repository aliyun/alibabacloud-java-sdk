// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateDiscoveredResourcesResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceProfiles")
    public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateDiscoveredResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateDiscoveredResourcesResponseBody self = new ListAggregateDiscoveredResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateDiscoveredResourcesResponseBody setDiscoveredResourceProfiles(ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles) {
        this.discoveredResourceProfiles = discoveredResourceProfiles;
        return this;
    }
    public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles getDiscoveredResourceProfiles() {
        return this.discoveredResourceProfiles;
    }

    public ListAggregateDiscoveredResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public String tags;

        public static ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList self = new ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList();
            return TeaModel.build(map, self);
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles extends TeaModel {
        @NameInMap("DiscoveredResourceProfileList")
        public java.util.List<ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles self = new ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles();
            return TeaModel.build(map, self);
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setDiscoveredResourceProfileList(java.util.List<ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList) {
            this.discoveredResourceProfileList = discoveredResourceProfileList;
            return this;
        }
        public java.util.List<ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
            return this.discoveredResourceProfileList;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
