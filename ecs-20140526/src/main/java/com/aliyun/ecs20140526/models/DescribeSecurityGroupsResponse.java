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

    }

    public static class DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTagsTag> tag;

        public static DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags self = new DescribeSecurityGroupsResponseSecurityGroupsSecurityGroupTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeSecurityGroupsResponseSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> securityGroup;

        public static DescribeSecurityGroupsResponseSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroups self = new DescribeSecurityGroupsResponseSecurityGroups();
            return TeaModel.build(map, self);
        }

    }

}
