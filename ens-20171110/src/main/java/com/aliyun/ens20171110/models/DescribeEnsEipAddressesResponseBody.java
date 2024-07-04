// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesResponseBody extends TeaModel {
    /**
     * <p>Details about the EIP.</p>
     */
    @NameInMap("EipAddresses")
    public DescribeEnsEipAddressesResponseBodyEipAddresses eipAddresses;

    /**
     * <p>The page number. Valid values: an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8629F679-B51D-4194-A1CC-5D8F504C362B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEnsEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsEipAddressesResponseBody self = new DescribeEnsEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsEipAddressesResponseBody setEipAddresses(DescribeEnsEipAddressesResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEnsEipAddressesResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeEnsEipAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsEipAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5sainglpw7qfem3icir4s****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The time when the EIP was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1624885274000</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: <strong>5</strong> to <strong>10000</strong>. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The description of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-telecom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance that is associated with the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5sc3kum2e0sz34wbqrws9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance that is associated with the EIP. Valid values:</p>
         * <ul>
         * <li><strong>EnsInstance</strong>: ENS instance in a VPC</li>
         * <li><strong>SlbInstance</strong>: SLB instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The metering method of the EIP.</p>
         * <ul>
         * <li><strong>95BandwidthByMonth</strong>: Pay by monthly 95th percentile bandwidth</li>
         * <li><strong>PayByBandwidth</strong>: Pay by bandwidth</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The running status of the EIP. This parameter is returned if the EIP is a secondary EIP. Valid values:</p>
         * <ul>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Stopping</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("IpStatus")
        public String ipStatus;

        /**
         * <p>The Internet service provider (ISP). Valid values:</p>
         * <ul>
         * <li><strong>cmcc</strong>: China Mobile</li>
         * <li><strong>unicom</strong>: China Unicom</li>
         * <li><strong>telecom</strong>: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the EIP is a secondary EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Standby")
        public Boolean standby;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Associating</strong></li>
         * <li><strong>Unassociating</strong></li>
         * <li><strong>InUse</strong></li>
         * <li><strong>Available</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIpStatus(String ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public String getIpStatus() {
            return this.ipStatus;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setStandby(Boolean standby) {
            this.standby = standby;
            return this;
        }
        public Boolean getStandby() {
            return this.standby;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> eipAddress;

        public static DescribeEnsEipAddressesResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddresses self = new DescribeEnsEipAddressesResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddresses setEipAddress(java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
