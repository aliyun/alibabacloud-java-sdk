// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponse extends TeaModel {
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

    @NameInMap("HaVips")
    @Validation(required = true)
    public DescribeHaVipsResponseHaVips haVips;

    public static DescribeHaVipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponse self = new DescribeHaVipsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeHaVipsResponseHaVipsHaVipAssociatedInstances extends TeaModel {
        // associatedInstance
        @NameInMap("associatedInstance")
        @Validation(required = true)
        public java.util.List<String> associatedInstance;

        public static DescribeHaVipsResponseHaVipsHaVipAssociatedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVipAssociatedInstances self = new DescribeHaVipsResponseHaVipsHaVipAssociatedInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses extends TeaModel {
        // associatedEipAddresse
        @NameInMap("associatedEipAddresse")
        @Validation(required = true)
        public java.util.List<String> associatedEipAddresse;

        public static DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses self = new DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHaVipsResponseHaVipsHaVip extends TeaModel {
        @NameInMap("HaVipId")
        @Validation(required = true)
        public String haVipId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("AssociatedInstances")
        @Validation(required = true)
        public DescribeHaVipsResponseHaVipsHaVipAssociatedInstances associatedInstances;

        @NameInMap("AssociatedEipAddresses")
        @Validation(required = true)
        public DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses associatedEipAddresses;

        public static DescribeHaVipsResponseHaVipsHaVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVip self = new DescribeHaVipsResponseHaVipsHaVip();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHaVipsResponseHaVips extends TeaModel {
        @NameInMap("HaVip")
        @Validation(required = true)
        public java.util.List<DescribeHaVipsResponseHaVipsHaVip> haVip;

        public static DescribeHaVipsResponseHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVips self = new DescribeHaVipsResponseHaVips();
            return TeaModel.build(map, self);
        }

    }

}
