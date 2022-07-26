// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatTableEntries")
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnatTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponseBody self = new DescribeSnatTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatTableEntriesResponseBody setSnatTableEntries(java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries) {
        this.snatTableEntries = snatTableEntries;
        return this;
    }
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public DescribeSnatTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntries extends TeaModel {
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("SnatEntryId")
        public String snatEntryId;

        @NameInMap("SnatEntryName")
        public String snatEntryName;

        @NameInMap("SnatIp")
        public String snatIp;

        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        @NameInMap("Status")
        public String status;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntries self = new DescribeSnatTableEntriesResponseBodySnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
