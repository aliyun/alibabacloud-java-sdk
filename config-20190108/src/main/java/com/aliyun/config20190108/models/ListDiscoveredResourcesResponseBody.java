// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiscoveredResourceProfiles")
    public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles;

    public static ListDiscoveredResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesResponseBody self = new ListDiscoveredResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiscoveredResourcesResponseBody setDiscoveredResourceProfiles(ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles) {
        this.discoveredResourceProfiles = discoveredResourceProfiles;
        return this;
    }
    public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles getDiscoveredResourceProfiles() {
        return this.discoveredResourceProfiles;
    }

    public static class ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        public static ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList self = new ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

    }

    public static class ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DiscoveredResourceProfileList")
        public java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList;

        public static ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles self = new ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setDiscoveredResourceProfileList(java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList) {
            this.discoveredResourceProfileList = discoveredResourceProfileList;
            return this;
        }
        public java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
            return this.discoveredResourceProfileList;
        }

    }

}
