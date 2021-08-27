// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ForwardTableEntries")
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries;

    public static DescribeForwardTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponseBody self = new DescribeForwardTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeForwardTableEntriesResponseBody setForwardTableEntries(DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

        @NameInMap("ForwardTableId")
        public String forwardTableId;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("ExternalIp")
        public String externalIp;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry self = new DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntries self = new DescribeForwardTableEntriesResponseBodyForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardTableEntry(java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry) {
            this.forwardTableEntry = forwardTableEntry;
            return this;
        }
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

    }

}
