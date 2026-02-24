// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateDiscoveredResourcesResponseBody extends TeaModel {
    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("DiscoveredResourceProfiles")
    public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles discoveredResourceProfiles;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7817373-78CB-4F9A-8AFA-E7A88E9D64A2</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource. We recommend that you use the ResourceOwnerId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>161259599160****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The zone where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-a</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618675206000</p>
         */
        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        /**
         * <p>The status of the resource. Valid values:</p>
         * <ul>
         * <li><p>0: The resource is deleted.</p>
         * </li>
         * <li><p>1: The resource is in use.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp31cqoba96jagtz****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud Firewall</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>161259599160****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The status of the resource. The status of a resource is defined by the corresponding Alibaba Cloud service. This parameter can be empty. For example:</p>
         * <ul>
         * <li><p>If the resource type is ACS::ECS::Instance, the resource is stateful. The value of this parameter can be Running or Stopped.</p>
         * </li>
         * <li><p>If the resource type is ACS::OSS::Bucket, the resource is stateless. The value of this parameter is empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::NetworkInterface</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key1\&quot;:[\&quot;value2\&quot;]}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The timestamp of the last update to the resource. This is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1722441600000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the vSwitch to which the resource belongs. The format is vsw-t4n7pokxxxxxxxxxxxxxx. If the resource belongs to multiple vSwitches, the vSwitch IDs are separated by commas (,). An empty string is returned if the resource does not belong to a vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4n7pokxxxxxxxxxxxxxx</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The resource build version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        /**
         * <p>The ID of the VPC to which the resource belongs. The format is vpc-t4nhheyvay74fp7n0hxxx. An empty string is returned if the resource does not belong to a VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nhheyvay74fp7n0hxxx</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
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

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfiles extends TeaModel {
        /**
         * <p>The details of the resources.</p>
         */
        @NameInMap("DiscoveredResourceProfileList")
        public java.util.List<ListAggregateDiscoveredResourcesResponseBodyDiscoveredResourceProfilesDiscoveredResourceProfileList> discoveredResourceProfileList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
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
