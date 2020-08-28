// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponse self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @NameInMap("VbrId")
        @Validation(required = true)
        public String vbrId;

        @NameInMap("VbrOwnerUid")
        @Validation(required = true)
        public Long vbrOwnerUid;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ActivationTime")
        @Validation(required = true)
        public String activationTime;

        @NameInMap("TerminationTime")
        @Validation(required = true)
        public String terminationTime;

        @NameInMap("RecoveryTime")
        @Validation(required = true)
        public String recoveryTime;

        @NameInMap("VlanId")
        @Validation(required = true)
        public Integer vlanId;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

    }

}
