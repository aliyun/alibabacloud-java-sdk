// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponse extends TeaModel {
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

    @NameInMap("Vpcs")
    @Validation(required = true)
    public DescribeVpcsResponseVpcs vpcs;

    public static DescribeVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponse self = new DescribeVpcsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpcsResponseVpcsVpcVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcVSwitchIds self = new DescribeVpcsResponseVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpcUserCidrs extends TeaModel {
        // UserCidr
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcUserCidrs self = new DescribeVpcsResponseVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcsVpc extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("UserCidrs")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcUserCidrs userCidrs;

        public static DescribeVpcsResponseVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpc self = new DescribeVpcsResponseVpcsVpc();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpcsResponseVpcs extends TeaModel {
        @NameInMap("Vpc")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpc> vpc;

        public static DescribeVpcsResponseVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcs self = new DescribeVpcsResponseVpcs();
            return TeaModel.build(map, self);
        }

    }

}
