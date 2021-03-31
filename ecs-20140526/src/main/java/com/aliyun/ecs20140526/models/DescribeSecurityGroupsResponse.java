// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SecurityGroups")
    @Validation(required = true)
    public DescribeSecurityGroupsResponseSecurityGroups securityGroups;

    public static DescribeSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponse self = new DescribeSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSecurityGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsResponse setSecurityGroups(DescribeSecurityGroupsResponseSecurityGroups securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public DescribeSecurityGroupsResponseSecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    public static class DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag self = new DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag> tag;

        public static DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags self = new DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags setTag(java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SecurityGroupName")
        @Validation(required = true)
        public String securityGroupName;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("SecurityGroupType")
        @Validation(required = true)
        public String securityGroupType;

        @NameInMap("AvailableInstanceAmount")
        @Validation(required = true)
        public Integer availableInstanceAmount;

        @NameInMap("EcsCount")
        @Validation(required = true)
        public Integer ecsCount;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ServiceID")
        @Validation(required = true)
        public Long serviceID;

        @NameInMap("ServiceManaged")
        @Validation(required = true)
        public Boolean serviceManaged;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags tags;

        public static DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup self = new DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setServiceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Long getServiceID() {
            return this.serviceID;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setTags(DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeSecurityGroupsResponseSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> securityGroup;

        public static DescribeSecurityGroupsResponseSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroups self = new DescribeSecurityGroupsResponseSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroups setSecurityGroup(java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}
