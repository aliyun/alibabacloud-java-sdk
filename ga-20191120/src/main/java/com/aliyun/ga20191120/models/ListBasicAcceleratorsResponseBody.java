// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsResponseBody extends TeaModel {
    // 全球加速实例列表
    @NameInMap("Accelerators")
    public java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> accelerators;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 全球加速实例总数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBasicAcceleratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsResponseBody self = new ListBasicAcceleratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsResponseBody setAccelerators(java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> getAccelerators() {
        return this.accelerators;
    }

    public ListBasicAcceleratorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBasicAcceleratorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBasicAcceleratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicAcceleratorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage extends TeaModel {
        // 基础带宽包带宽
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 基础带宽包类型
        @NameInMap("BandwidthType")
        public String bandwidthType;

        // 基础带宽包Id
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage self = new ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage extends TeaModel {
        // 跨境带宽包带宽
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 跨境带宽包Id
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage self = new ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListBasicAcceleratorsResponseBodyAccelerators extends TeaModel {
        // 全球加速实例Id
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        // 绑定的基础带宽包
        @NameInMap("BasicBandwidthPackage")
        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage;

        // 全球加速实例下车点Id
        @NameInMap("BasicEndpointGroupId")
        public String basicEndpointGroupId;

        // 全球加速实例上车点Id
        @NameInMap("BasicIpSetId")
        public String basicIpSetId;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 绑定的跨境带宽包
        @NameInMap("CrossDomainBandwidthPackage")
        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage;

        // 全球加速实例描述
        @NameInMap("Description")
        public String description;

        // 到期时间
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        // 全球加速实例计费类型
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        // 全球加速实例名称
        @NameInMap("Name")
        public String name;

        // RegionId
        @NameInMap("RegionId")
        public String regionId;

        // 全球加速实例状态
        @NameInMap("State")
        public String state;

        // 全球加速实例类型
        @NameInMap("Type")
        public String type;

        public static ListBasicAcceleratorsResponseBodyAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAccelerators self = new ListBasicAcceleratorsResponseBodyAccelerators();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicBandwidthPackage(ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }
        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicEndpointGroupId(String basicEndpointGroupId) {
            this.basicEndpointGroupId = basicEndpointGroupId;
            return this;
        }
        public String getBasicEndpointGroupId() {
            return this.basicEndpointGroupId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicIpSetId(String basicIpSetId) {
            this.basicIpSetId = basicIpSetId;
            return this;
        }
        public String getBasicIpSetId() {
            return this.basicIpSetId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setCrossDomainBandwidthPackage(ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }
        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
