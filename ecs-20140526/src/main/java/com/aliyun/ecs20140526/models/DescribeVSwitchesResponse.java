// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VSwitches")
    @Validation(required = true)
    public DescribeVSwitchesResponseVSwitches vSwitches;

    public static DescribeVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponse self = new DescribeVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitch extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("AvailableIpAddressCount")
        @Validation(required = true)
        public Long availableIpAddressCount;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VSwitchName")
        @Validation(required = true)
        public String vSwitchName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        public static DescribeVSwitchesResponseVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitch self = new DescribeVSwitchesResponseVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVSwitchesResponseVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchesResponseVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitches self = new DescribeVSwitchesResponseVSwitches();
            return TeaModel.build(map, self);
        }

    }

}
