// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiscoveredResourceProfiles")
    @Validation(required = true)
    public ListDiscoveredResourcesResponseDiscoveredResourceProfiles discoveredResourceProfiles;

    public static ListDiscoveredResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesResponse self = new ListDiscoveredResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiscoveredResourcesResponse setDiscoveredResourceProfiles(ListDiscoveredResourcesResponseDiscoveredResourceProfiles discoveredResourceProfiles) {
        this.discoveredResourceProfiles = discoveredResourceProfiles;
        return this;
    }
    public ListDiscoveredResourcesResponseDiscoveredResourceProfiles getDiscoveredResourceProfiles() {
        return this.discoveredResourceProfiles;
    }

    public static class ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ResourceCreationTime")
        @Validation(required = true)
        public Long resourceCreationTime;

        @NameInMap("ResourceDeleted")
        @Validation(required = true)
        public Integer resourceDeleted;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("ResourceStatus")
        @Validation(required = true)
        public String resourceStatus;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList self = new ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListDiscoveredResourcesResponseDiscoveredResourceProfiles extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("DiscoveredResourceProfileList")
        @Validation(required = true)
        public java.util.List<ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList;

        public static ListDiscoveredResourcesResponseDiscoveredResourceProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseDiscoveredResourceProfiles self = new ListDiscoveredResourcesResponseDiscoveredResourceProfiles();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfiles setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfiles setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfiles setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDiscoveredResourcesResponseDiscoveredResourceProfiles setDiscoveredResourceProfileList(java.util.List<ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList) {
            this.discoveredResourceProfileList = discoveredResourceProfileList;
            return this;
        }
        public java.util.List<ListDiscoveredResourcesResponseDiscoveredResourceProfilesDiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
            return this.discoveredResourceProfileList;
        }

    }

}
