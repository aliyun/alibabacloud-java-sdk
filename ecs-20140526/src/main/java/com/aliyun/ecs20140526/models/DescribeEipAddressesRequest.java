// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("EipAddress")
    public String eipAddress;

    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    @Validation(required = true)
    public java.util.List<DescribeEipAddressesRequestFilter> filter;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    @NameInMap("ChargeType")
    public String chargeType;

    public static DescribeEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesRequest self = new DescribeEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeEipAddressesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeEipAddressesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesRequestFilter self = new DescribeEipAddressesRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
