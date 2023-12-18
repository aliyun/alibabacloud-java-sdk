// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of SNAT entries.</p>
     */
    @NameInMap("SnatTableEntries")
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries;

    /**
     * <p>The number of SNAT entries that are returned.</p>
     */
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
        /**
         * <p>The ID of the NAT gateway.</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The ID of the SNAT entry.</p>
         */
        @NameInMap("SnatEntryId")
        public String snatEntryId;

        /**
         * <p>The name of the SNAT entry.</p>
         */
        @NameInMap("SnatEntryName")
        public String snatEntryName;

        /**
         * <p>The EIP specified in the SNAT entry.</p>
         */
        @NameInMap("SnatIp")
        public String snatIp;

        /**
         * <p>The source CIDR block specified in the SNAT entry.</p>
         */
        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        /**
         * <p>The secondary EIP. Multiple EIPs are separated by commas (,).</p>
         */
        @NameInMap("StandbySnatIp")
        public String standbySnatIp;

        /**
         * <p>The status of the secondary EIP. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Stopping</p>
         * <p>*   Stopped</p>
         * <p>*   Starting</p>
         */
        @NameInMap("StandbyStatus")
        public String standbyStatus;

        /**
         * <p>The status of the SNAT entry. Valid values:</p>
         * <br>
         * <p>*   Pending: The SNAT entry is being created or modified.</p>
         * <p>*   Available: The SNAT entry is available.</p>
         * <p>*   Deleting: The SNAT entry is being deleted.</p>
         */
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

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setStandbySnatIp(String standbySnatIp) {
            this.standbySnatIp = standbySnatIp;
            return this;
        }
        public String getStandbySnatIp() {
            return this.standbySnatIp;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setStandbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }
        public String getStandbyStatus() {
            return this.standbyStatus;
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
