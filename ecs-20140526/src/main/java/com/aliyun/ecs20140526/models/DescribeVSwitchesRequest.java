// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesRequest self = new DescribeVSwitchesRequest();
        return TeaModel.build(map, self);
    }

}
