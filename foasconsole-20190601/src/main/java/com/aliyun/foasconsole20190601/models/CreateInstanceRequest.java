// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateInstanceRequest")
    public CreateInstanceRequestCreateInstanceRequest createInstanceRequest;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setCreateInstanceRequest(CreateInstanceRequestCreateInstanceRequest createInstanceRequest) {
        this.createInstanceRequest = createInstanceRequest;
        return this;
    }
    public CreateInstanceRequestCreateInstanceRequest getCreateInstanceRequest() {
        return this.createInstanceRequest;
    }

    public static class CreateInstanceRequestCreateInstanceRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static CreateInstanceRequestCreateInstanceRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequestHaResourceSpec self = new CreateInstanceRequestCreateInstanceRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public CreateInstanceRequestCreateInstanceRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class CreateInstanceRequestCreateInstanceRequestResourceSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static CreateInstanceRequestCreateInstanceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequestResourceSpec self = new CreateInstanceRequestCreateInstanceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public CreateInstanceRequestCreateInstanceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class CreateInstanceRequestCreateInstanceRequestStorageOss extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss_flink</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        public static CreateInstanceRequestCreateInstanceRequestStorageOss build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequestStorageOss self = new CreateInstanceRequestCreateInstanceRequestStorageOss();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequestStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class CreateInstanceRequestCreateInstanceRequestStorage extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Oss")
        public CreateInstanceRequestCreateInstanceRequestStorageOss oss;

        public static CreateInstanceRequestCreateInstanceRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequestStorage self = new CreateInstanceRequestCreateInstanceRequestStorage();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequestStorage setOss(CreateInstanceRequestCreateInstanceRequestStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestStorageOss getOss() {
            return this.oss;
        }

    }

    public static class CreateInstanceRequestCreateInstanceRequest extends TeaModel {
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaResourceSpec")
        public CreateInstanceRequestCreateInstanceRequestHaResourceSpec haResourceSpec;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaVSwitchIds")
        public java.util.List<String> haVSwitchIds;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaZoneId")
        public String haZoneId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vvp1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <strong>example:</strong>
         * <p>5RT******</p>
         */
        @NameInMap("PromotionCode")
        public String promotionCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>rg-******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceSpec")
        public CreateInstanceRequestCreateInstanceRequestResourceSpec resourceSpec;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Storage")
        public CreateInstanceRequestCreateInstanceRequestStorage storage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UsePromotionCode")
        public Boolean usePromotionCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>VPC ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9*******nxfmfcdi</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateInstanceRequestCreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequest self = new CreateInstanceRequestCreateInstanceRequest();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequest setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public CreateInstanceRequestCreateInstanceRequest setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateInstanceRequestCreateInstanceRequest setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateInstanceRequestCreateInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public CreateInstanceRequestCreateInstanceRequest setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public CreateInstanceRequestCreateInstanceRequest setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public CreateInstanceRequestCreateInstanceRequest setHaResourceSpec(CreateInstanceRequestCreateInstanceRequestHaResourceSpec haResourceSpec) {
            this.haResourceSpec = haResourceSpec;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestHaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        public CreateInstanceRequestCreateInstanceRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }
        public java.util.List<String> getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        public CreateInstanceRequestCreateInstanceRequest setHaZoneId(String haZoneId) {
            this.haZoneId = haZoneId;
            return this;
        }
        public String getHaZoneId() {
            return this.haZoneId;
        }

        public CreateInstanceRequestCreateInstanceRequest setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateInstanceRequestCreateInstanceRequest setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public CreateInstanceRequestCreateInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public CreateInstanceRequestCreateInstanceRequest setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public CreateInstanceRequestCreateInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateInstanceRequestCreateInstanceRequest setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateInstanceRequestCreateInstanceRequest setResourceSpec(CreateInstanceRequestCreateInstanceRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public CreateInstanceRequestCreateInstanceRequest setStorage(CreateInstanceRequestCreateInstanceRequestStorage storage) {
            this.storage = storage;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestStorage getStorage() {
            return this.storage;
        }

        public CreateInstanceRequestCreateInstanceRequest setUsePromotionCode(Boolean usePromotionCode) {
            this.usePromotionCode = usePromotionCode;
            return this;
        }
        public Boolean getUsePromotionCode() {
            return this.usePromotionCode;
        }

        public CreateInstanceRequestCreateInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateInstanceRequestCreateInstanceRequest setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateInstanceRequestCreateInstanceRequest setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
