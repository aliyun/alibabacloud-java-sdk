// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeDemandsRequestTag> tag;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DemandId")
    public String demandId;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("DemandType")
    public String demandType;

    @NameInMap("DemandStatus")
    public java.util.List<String> demandStatus;

    public static DescribeDemandsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsRequest self = new DescribeDemandsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDemandsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDemandsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsRequestTag self = new DescribeDemandsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
