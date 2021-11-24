// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    public java.util.List<ListAcceleratorsResponseBodyAccelerators> accelerators;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAcceleratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAcceleratorsResponseBody self = new ListAcceleratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAcceleratorsResponseBody setAccelerators(java.util.List<ListAcceleratorsResponseBodyAccelerators> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<ListAcceleratorsResponseBodyAccelerators> getAccelerators() {
        return this.accelerators;
    }

    public ListAcceleratorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAcceleratorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAcceleratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAcceleratorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage self = new ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage self = new ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListAcceleratorsResponseBodyAccelerators extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BasicBandwidthPackage")
        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CrossDomainBandwidthPackage")
        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage;

        @NameInMap("DdosId")
        public String ddosId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DnsName")
        public String dnsName;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecondDnsName")
        public String secondDnsName;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public String type;

        public static ListAcceleratorsResponseBodyAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAccelerators self = new ListAcceleratorsResponseBodyAccelerators();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListAcceleratorsResponseBodyAccelerators setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAccelerators setBasicBandwidthPackage(ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }
        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        public ListAcceleratorsResponseBodyAccelerators setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListAcceleratorsResponseBodyAccelerators setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAcceleratorsResponseBodyAccelerators setCrossDomainBandwidthPackage(ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }
        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        public ListAcceleratorsResponseBodyAccelerators setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public ListAcceleratorsResponseBodyAccelerators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAcceleratorsResponseBodyAccelerators setDnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public String getDnsName() {
            return this.dnsName;
        }

        public ListAcceleratorsResponseBodyAccelerators setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListAcceleratorsResponseBodyAccelerators setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListAcceleratorsResponseBodyAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAcceleratorsResponseBodyAccelerators setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAcceleratorsResponseBodyAccelerators setSecondDnsName(String secondDnsName) {
            this.secondDnsName = secondDnsName;
            return this;
        }
        public String getSecondDnsName() {
            return this.secondDnsName;
        }

        public ListAcceleratorsResponseBodyAccelerators setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListAcceleratorsResponseBodyAccelerators setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAcceleratorsResponseBodyAccelerators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
