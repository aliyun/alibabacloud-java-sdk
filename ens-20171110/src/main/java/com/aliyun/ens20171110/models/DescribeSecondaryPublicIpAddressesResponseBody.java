// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecondaryPublicIpAddressesResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
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
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of returned secondary IP addresses.</p>
     */
    @NameInMap("SecondaryPublicIpAddresses")
    public java.util.List<DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses> secondaryPublicIpAddresses;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecondaryPublicIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondaryPublicIpAddressesResponseBody self = new DescribeSecondaryPublicIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecondaryPublicIpAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecondaryPublicIpAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecondaryPublicIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecondaryPublicIpAddressesResponseBody setSecondaryPublicIpAddresses(java.util.List<DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses> secondaryPublicIpAddresses) {
        this.secondaryPublicIpAddresses = secondaryPublicIpAddresses;
        return this;
    }
    public java.util.List<DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses> getSecondaryPublicIpAddresses() {
        return this.secondaryPublicIpAddresses;
    }

    public DescribeSecondaryPublicIpAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses extends TeaModel {
        /**
         * <p>The subnet mask of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("CidrMask")
        public Integer cidrMask;

        /**
         * <p>The time when the secondary public IP address was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T09:43:49Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-15</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>12.XXX.XXX.1</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The version of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong></li>
         * <li><strong>ipv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The Internet service provider. Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile.</li>
         * <li>unicom: China Unicom.</li>
         * <li>telecom: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The secondary public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>12.XXX.XXX.4</p>
         */
        @NameInMap("SecondaryPublicIpAddress")
        public String secondaryPublicIpAddress;

        /**
         * <p>The ID of the secondary public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>spi-5wys0pio93c9f9ukzj2f2fwyr</p>
         */
        @NameInMap("SecondaryPublicIpId")
        public String secondaryPublicIpId;

        public static DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses self = new DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setCidrMask(Integer cidrMask) {
            this.cidrMask = cidrMask;
            return this;
        }
        public Integer getCidrMask() {
            return this.cidrMask;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setSecondaryPublicIpAddress(String secondaryPublicIpAddress) {
            this.secondaryPublicIpAddress = secondaryPublicIpAddress;
            return this;
        }
        public String getSecondaryPublicIpAddress() {
            return this.secondaryPublicIpAddress;
        }

        public DescribeSecondaryPublicIpAddressesResponseBodySecondaryPublicIpAddresses setSecondaryPublicIpId(String secondaryPublicIpId) {
            this.secondaryPublicIpId = secondaryPublicIpId;
            return this;
        }
        public String getSecondaryPublicIpId() {
            return this.secondaryPublicIpId;
        }

    }

}
