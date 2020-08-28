// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    @Validation(required = true)
    public Long updateTimestamp;

    @NameInMap("AddrCount")
    @Validation(required = true)
    public Integer addrCount;

    @NameInMap("MinAvailableAddrNum")
    @Validation(required = true)
    public Integer minAvailableAddrNum;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    @NameInMap("MonitorStatus")
    @Validation(required = true)
    public String monitorStatus;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Addrs")
    @Validation(required = true)
    public DescribeGtmInstanceAddressPoolResponseAddrs addrs;

    public static DescribeGtmInstanceAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolResponse self = new DescribeGtmInstanceAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmInstanceAddressPoolResponseAddrsAddr extends TeaModel {
        @NameInMap("AddrId")
        @Validation(required = true)
        public Long addrId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        @Validation(required = true)
        public Long updateTimestamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("AlertStatus")
        @Validation(required = true)
        public String alertStatus;

        public static DescribeGtmInstanceAddressPoolResponseAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseAddrsAddr self = new DescribeGtmInstanceAddressPoolResponseAddrsAddr();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmInstanceAddressPoolResponseAddrs extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstanceAddressPoolResponseAddrsAddr> addr;

        public static DescribeGtmInstanceAddressPoolResponseAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseAddrs self = new DescribeGtmInstanceAddressPoolResponseAddrs();
            return TeaModel.build(map, self);
        }

    }

}
