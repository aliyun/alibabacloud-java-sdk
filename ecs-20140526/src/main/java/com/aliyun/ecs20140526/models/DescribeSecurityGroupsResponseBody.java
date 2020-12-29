// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("SecurityGroups")
    public DescribeSecurityGroupsResponseBodySecurityGroups securityGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponseBody self = new DescribeSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeSecurityGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Tags")
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags tags;

        @NameInMap("ServiceID")
        public Long serviceID;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setTags(DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupTags getTags() {
            return this.tags;
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

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
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
