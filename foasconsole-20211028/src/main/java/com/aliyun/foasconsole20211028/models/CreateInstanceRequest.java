// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("ArchitectureType")
    public String architectureType;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("Ha")
    public Boolean ha;

    @NameInMap("HaResourceSpec")
    public CreateInstanceRequestHaResourceSpec haResourceSpec;

    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    @NameInMap("HaZoneId")
    public String haZoneId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("MonitorType")
    public String monitorType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("PromotionCode")
    public String promotionCode;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceSpec")
    public CreateInstanceRequestResourceSpec resourceSpec;

    @NameInMap("Storage")
    public CreateInstanceRequestStorage storage;

    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateInstanceRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public CreateInstanceRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public CreateInstanceRequest setHaResourceSpec(CreateInstanceRequestHaResourceSpec haResourceSpec) {
        this.haResourceSpec = haResourceSpec;
        return this;
    }
    public CreateInstanceRequestHaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    public CreateInstanceRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
        this.haVSwitchIds = haVSwitchIds;
        return this;
    }
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    public CreateInstanceRequest setHaZoneId(String haZoneId) {
        this.haZoneId = haZoneId;
        return this;
    }
    public String getHaZoneId() {
        return this.haZoneId;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }
    public String getMonitorType() {
        return this.monitorType;
    }

    public CreateInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateInstanceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setResourceSpec(CreateInstanceRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public CreateInstanceRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public CreateInstanceRequest setStorage(CreateInstanceRequestStorage storage) {
        this.storage = storage;
        return this;
    }
    public CreateInstanceRequestStorage getStorage() {
        return this.storage;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    public CreateInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateInstanceRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static CreateInstanceRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestHaResourceSpec self = new CreateInstanceRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public CreateInstanceRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class CreateInstanceRequestResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static CreateInstanceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestResourceSpec self = new CreateInstanceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public CreateInstanceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class CreateInstanceRequestStorageOss extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        public static CreateInstanceRequestStorageOss build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestStorageOss self = new CreateInstanceRequestStorageOss();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class CreateInstanceRequestStorage extends TeaModel {
        @NameInMap("Oss")
        public CreateInstanceRequestStorageOss oss;

        public static CreateInstanceRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestStorage self = new CreateInstanceRequestStorage();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestStorage setOss(CreateInstanceRequestStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public CreateInstanceRequestStorageOss getOss() {
            return this.oss;
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
