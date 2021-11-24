// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAcceleratorResponseBody extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 绑定的基础带宽包
    @NameInMap("BasicBandwidthPackage")
    public GetBasicAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    // 全球加速实例下车点Id
    @NameInMap("BasicEndpointGroupId")
    public String basicEndpointGroupId;

    // 全球加速实例上车点Id
    @NameInMap("BasicIpSetId")
    public String basicIpSetId;

    // 使用的云企业网Id
    @NameInMap("CenId")
    public String cenId;

    // 全球加速实例创建时间
    @NameInMap("CreateTime")
    public Long createTime;

    // 绑定的跨境带宽包
    @NameInMap("CrossDomainBandwidthPackage")
    public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    // 全球加速实例描述
    @NameInMap("Description")
    public String description;

    // 到期时间
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    // 全球加速实例收费类型
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // 全球加速实例名称
    @NameInMap("Name")
    public String name;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例状态
    @NameInMap("State")
    public String state;

    public static GetBasicAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAcceleratorResponseBody self = new GetBasicAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAcceleratorResponseBody setBasicBandwidthPackage(GetBasicAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage) {
        this.basicBandwidthPackage = basicBandwidthPackage;
        return this;
    }
    public GetBasicAcceleratorResponseBodyBasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    public GetBasicAcceleratorResponseBody setBasicEndpointGroupId(String basicEndpointGroupId) {
        this.basicEndpointGroupId = basicEndpointGroupId;
        return this;
    }
    public String getBasicEndpointGroupId() {
        return this.basicEndpointGroupId;
    }

    public GetBasicAcceleratorResponseBody setBasicIpSetId(String basicIpSetId) {
        this.basicIpSetId = basicIpSetId;
        return this;
    }
    public String getBasicIpSetId() {
        return this.basicIpSetId;
    }

    public GetBasicAcceleratorResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetBasicAcceleratorResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetBasicAcceleratorResponseBody setCrossDomainBandwidthPackage(GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
        this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
        return this;
    }
    public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    public GetBasicAcceleratorResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBasicAcceleratorResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public GetBasicAcceleratorResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public GetBasicAcceleratorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicAcceleratorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBasicAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAcceleratorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class GetBasicAcceleratorResponseBodyBasicBandwidthPackage extends TeaModel {
        // 基础带宽包带宽
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 基础带宽包类型
        @NameInMap("BandwidthType")
        public String bandwidthType;

        // 基础带宽包Id
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetBasicAcceleratorResponseBodyBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            GetBasicAcceleratorResponseBodyBasicBandwidthPackage self = new GetBasicAcceleratorResponseBodyBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage extends TeaModel {
        // 跨境带宽包带宽
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 跨境带宽包Id
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage self = new GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
