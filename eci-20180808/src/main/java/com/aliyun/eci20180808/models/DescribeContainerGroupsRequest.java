// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Tag")
    public java.util.List<DescribeContainerGroupsRequestTag> tag;

    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    @NameInMap("Status")
    public String status;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("WithEvent")
    public Boolean withEvent;

    public static DescribeContainerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsRequest self = new DescribeContainerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeContainerGroupsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeContainerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsRequestTag self = new DescribeContainerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
