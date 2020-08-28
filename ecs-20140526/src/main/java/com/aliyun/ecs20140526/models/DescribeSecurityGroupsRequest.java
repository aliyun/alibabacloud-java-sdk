// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    @NameInMap("Tag")
    public java.util.List<DescribeSecurityGroupsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("IsQueryEcsCount")
    public Boolean isQueryEcsCount;

    @NameInMap("FuzzyQuery")
    public Boolean fuzzyQuery;

    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DescribeSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsRequest self = new DescribeSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeSecurityGroupsRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeSecurityGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsRequestTag self = new DescribeSecurityGroupsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
