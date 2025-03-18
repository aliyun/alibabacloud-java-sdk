// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the SNAT entries.</p>
     */
    @NameInMap("SnatTableEntries")
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries;

    /**
     * <p>The number of SNAT entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
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
        @NameInMap("EipAffinity")
        public Boolean eipAffinity;

        /**
         * <p>The timeout period for idle connections. Valid values: <strong>1</strong> to <strong>86400</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>Whether to enable operator affinity. Value taking:</p>
         * <ul>
         * <li><p>false:Do not open.</p>
         * </li>
         * <li><p>true:Open.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IspAffinity")
        public Boolean ispAffinity;

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The ID of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tfjp3537mi6iokl59g5c****</p>
         */
        @NameInMap("SnatEntryId")
        public String snatEntryId;

        /**
         * <p>The name of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        @NameInMap("SnatEntryName")
        public String snatEntryName;

        /**
         * <p>The EIP specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XXX.XXX.71</p>
         */
        @NameInMap("SnatIp")
        public String snatIp;

        /**
         * <p>The source CIDR block specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.13/32</p>
         */
        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        /**
         * <p>The secondary EIP. Multiple EIPs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>101.XXX.XXX.7</p>
         */
        @NameInMap("StandbySnatIp")
        public String standbySnatIp;

        /**
         * <p>The status of the secondary EIP. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Starting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("StandbyStatus")
        public String standbyStatus;

        /**
         * <p>The status of the SNAT entry. Valid values:</p>
         * <ul>
         * <li>Pending: The SNAT entry is being created or modified.</li>
         * <li>Available: The SNAT entry is available.</li>
         * <li>Deleting: The SNAT entry is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntries self = new DescribeSnatTableEntriesResponseBodySnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setEipAffinity(Boolean eipAffinity) {
            this.eipAffinity = eipAffinity;
            return this;
        }
        public Boolean getEipAffinity() {
            return this.eipAffinity;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setIspAffinity(Boolean ispAffinity) {
            this.ispAffinity = ispAffinity;
            return this;
        }
        public Boolean getIspAffinity() {
            return this.ispAffinity;
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
