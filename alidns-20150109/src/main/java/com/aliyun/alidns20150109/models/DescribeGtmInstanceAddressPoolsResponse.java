// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AddrPools")
    @Validation(required = true)
    public DescribeGtmInstanceAddressPoolsResponseAddrPools addrPools;

    public static DescribeGtmInstanceAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsResponse self = new DescribeGtmInstanceAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool extends TeaModel {
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

        public static DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool self = new DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmInstanceAddressPoolsResponseAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> addrPool;

        public static DescribeGtmInstanceAddressPoolsResponseAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseAddrPools self = new DescribeGtmInstanceAddressPoolsResponseAddrPools();
            return TeaModel.build(map, self);
        }

    }

}
