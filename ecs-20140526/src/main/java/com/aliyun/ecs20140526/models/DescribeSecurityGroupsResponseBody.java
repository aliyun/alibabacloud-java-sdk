// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that can be used in the next request to retrieve a new page of results. If the return value of this parameter is empty when you specify the MaxResults and NextToken parameters for a paged query, no more results are to be returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the security groups.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public DescribeSecurityGroupsResponseBodySecurityGroups securityGroups;

    /**
     * <p>The total number of security groups. If you specify the `MaxResults` and `NextToken` parameters in the request, this parameter is empty.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponseBody self = new DescribeSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSecurityGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponseBody setSecurityGroups(DescribeSecurityGroupsResponseBodySecurityGroups securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public DescribeSecurityGroupsResponseBodySecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    public DescribeSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag extends TeaModel {
        /**
         * <p>The tag keys of the security group.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag values of the security group.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag> tag;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags setTag(java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and unavailable for general users.</p>
         */
        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        /**
         * <p>The time when the security group was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the security group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>> This parameter is in invitational preview and unavailable for general users.</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The ID of the resource group to which the security group belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the security group.</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        /**
         * <p>The type of the security group. Valid values:</p>
         * <br>
         * <p>*   normal: basic security group</p>
         * <p>*   enterprise: advanced security group</p>
         */
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        /**
         * <p>The ID of the distributor to which the security group belongs.</p>
         */
        @NameInMap("ServiceID")
        public Long serviceID;

        /**
         * <p>Indicates whether the user of the security group is an Alibaba Cloud service or a distributor.</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The tags of the security groups.</p>
         */
        @NameInMap("Tags")
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags tags;

        /**
         * <p>The ID of the VPC to which the security group belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setServiceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Long getServiceID() {
            return this.serviceID;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setTags(DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags getTags() {
            return this.tags;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> securityGroup;

        public static DescribeSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroups self = new DescribeSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroups setSecurityGroup(java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}
