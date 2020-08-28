// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponse extends TeaModel {
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

    @NameInMap("ForwardTableEntries")
    @Validation(required = true)
    public DescribeForwardTableEntriesResponseForwardTableEntries forwardTableEntries;

    public static DescribeForwardTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponse self = new DescribeForwardTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry extends TeaModel {
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public String forwardTableId;

        @NameInMap("ForwardEntryId")
        @Validation(required = true)
        public String forwardEntryId;

        @NameInMap("ExternalIp")
        @Validation(required = true)
        public String externalIp;

        @NameInMap("ExternalPort")
        @Validation(required = true)
        public String externalPort;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        public String ipProtocol;

        @NameInMap("InternalIp")
        @Validation(required = true)
        public String internalIp;

        @NameInMap("InternalPort")
        @Validation(required = true)
        public String internalPort;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry self = new DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeForwardTableEntriesResponseForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        @Validation(required = true)
        public java.util.List<DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry> forwardTableEntry;

        public static DescribeForwardTableEntriesResponseForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseForwardTableEntries self = new DescribeForwardTableEntriesResponseForwardTableEntries();
            return TeaModel.build(map, self);
        }

    }

}
