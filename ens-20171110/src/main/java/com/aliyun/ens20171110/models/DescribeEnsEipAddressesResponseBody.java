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
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: **10** to **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The time when the EIP was created.</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: **5** to **10000**. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription.</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The description of the EIP.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance that is associated with the EIP.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance that is associated with the EIP. Valid values:</p>
         * <br>
         * <p>*   **EnsInstance**: ENS instance in a VPC</p>
         * <p>*   **SlbInstance**: SLB instance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The metering method of the EIP.</p>
         * <br>
         * <p>*   **95BandwidthByMonth**: Pay by monthly 95th percentile bandwidth</p>
         * <p>*   **PayByBandwidth**: Pay by bandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The running status of the EIP. This parameter is returned if the EIP is a secondary EIP. Valid values:</p>
         * <br>
         * <p>*   **Stopped**</p>
         * <p>*   **Running**</p>
         * <p>*   **Starting**</p>
         * <p>*   **Stopping**</p>
         */
        @NameInMap("IpStatus")
        public String ipStatus;

        /**
         * <p>The Internet service provider (ISP). Valid values:</p>
         * <br>
         * <p>*   **cmcc**: China Mobile</p>
         * <p>*   **unicom**: China Unicom</p>
         * <p>*   **telecom**: China Telecom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the EIP.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the EIP is a secondary EIP.</p>
         */
        @NameInMap("Standby")
        public Boolean standby;

        /**
         * <p>The status of the EIP. Valid values:</p>
         * <br>
         * <p>*   **Associating**</p>
         * <p>*   **Unassociating**</p>
         * <p>*   **InUse**</p>
         * <p>*   **Available**</p>
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
