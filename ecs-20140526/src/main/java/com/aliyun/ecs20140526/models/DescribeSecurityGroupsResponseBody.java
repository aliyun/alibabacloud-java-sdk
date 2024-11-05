// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. If the return value of this parameter is empty when MaxResults and NextToken are used for a paged query, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9cc11</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p>This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <blockquote>
     * <p>This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public DescribeSecurityGroupsResponseBodySecurityGroups securityGroups;

    /**
     * <p>The total number of security groups returned. If <code>MaxResults</code> and <code>NextToken</code> are specified in the request, the value of this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
         * <p>The number of private IP addresses that can be added to the security group. For more information, see the &quot;Security group capacity&quot; section in <a href="~~605897#section-kj9-e46-6v5~~">Basic security groups and advanced security groups</a>.</p>
         * <p>If you set IsQueryEcsCount to True, the return value of AvailableInstanceAmount is valid.</p>
         * <blockquote>
         * <p> This parameter is deprecated. The returned quantity is provided only for reference. The actual quantity may differ from the returned quantity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        /**
         * <p>The time when the security group was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T03:12:29Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of private IP addresses that are contained in the security group. For more information, see the &quot;Security group capacity&quot; section in <a href="~~605897#section-kj9-e46-6v5~~">Basic security groups and advanced security groups</a>.</p>
         * <p>If you set IsQueryEcsCount to True, the return value of EcsCount is valid.</p>
         * <blockquote>
         * <p> This parameter is deprecated. The returned quantity is provided only for reference. The actual quantity may differ from the returned quantity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The number of rules that reference security groups in the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("GroupToGroupRuleCount")
        public Integer groupToGroupRuleCount;

        /**
         * <p>The ID of the resource group to which the security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of rules in the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>SGTestName</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        /**
         * <p>The type of the security group. Valid values:</p>
         * <ul>
         * <li>normal: basic security group</li>
         * <li>enterprise: advanced security group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        /**
         * <p>The ID of the distributor to which the security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        @NameInMap("ServiceID")
        public Long serviceID;

        /**
         * <p>Indicates whether the user of the security group is an Alibaba Cloud service or a distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The tags of the security group.</p>
         */
        @NameInMap("Tags")
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags tags;

        /**
         * <p>The ID of the VPC to which the security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp67acfmxazb4p****</p>
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

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setGroupToGroupRuleCount(Integer groupToGroupRuleCount) {
            this.groupToGroupRuleCount = groupToGroupRuleCount;
            return this;
        }
        public Integer getGroupToGroupRuleCount() {
            return this.groupToGroupRuleCount;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
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
