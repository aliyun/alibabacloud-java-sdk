// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesResponseBody extends TeaModel {
    @NameInMap("EipAddresses")
    public DescribeEnsEipAddressesResponseBodyEipAddresses eipAddresses;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("AllocationTime")
        public String allocationTime;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("IpStatus")
        public String ipStatus;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Standby")
        public Boolean standby;

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
