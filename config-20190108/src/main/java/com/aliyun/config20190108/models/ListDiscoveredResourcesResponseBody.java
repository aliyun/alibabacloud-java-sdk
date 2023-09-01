// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the returned resources.</p>
     */
    @NameInMap("DiscoveredResourceProfiles")
    public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDiscoveredResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesResponseBody self = new ListDiscoveredResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesResponseBody setDiscoveredResourceProfiles(ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles) {
        this.discoveredResourceProfiles = discoveredResourceProfiles;
        return this;
    }
    public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles getDiscoveredResourceProfiles() {
        return this.discoveredResourceProfiles;
    }

    public ListDiscoveredResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created.</p>
         */
        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        /**
         * <p>Indicates whether the resource is deleted. Valid values:</p>
         * <br>
         * <p>*   1: The resource is retained.</p>
         * <p>*   0: The resource is deleted.</p>
         */
        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty.</p>
         * <br>
         * <p>Examples:</p>
         * <br>
         * <p>*   If the value of the ResourceType parameter is ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</p>
         * <p>*   If the value of the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that does not have a specific state. In this case, this parameter is left empty.</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList self = new ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
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

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
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

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles extends TeaModel {
        /**
         * <p>The information about the resource.</p>
         */
        @NameInMap("DiscoveredResourceProfileList")
        public java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList;

        /**
         * <p>The page number of the returned page. Pages start from page 1.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Valid values: 1 to 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of resources.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles self = new ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles();
            return TeaModel.build(map, self);
        }

        public ListDiscoveredResourcesResponseBodyDiscoveredResourceProfiles setDiscoveredResourceProfileList(java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList) {
            this.discoveredResourceProfileList = discoveredResourceProfileList;
            return this;
        }
        public java.util.List<ListDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
            return this.discoveredResourceProfileList;
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

    }

}
