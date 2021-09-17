// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
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

    public static class CreateInstanceRequestCreateInstanceRequestResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

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
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Region")
        public String region;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("ResourceSpec")
        public CreateInstanceRequestCreateInstanceRequestResourceSpec resourceSpec;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("Storage")
        public CreateInstanceRequestCreateInstanceRequestStorage storage;

        public static CreateInstanceRequestCreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCreateInstanceRequest self = new CreateInstanceRequestCreateInstanceRequest();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCreateInstanceRequest setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateInstanceRequestCreateInstanceRequest setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateInstanceRequestCreateInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateInstanceRequestCreateInstanceRequest setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateInstanceRequestCreateInstanceRequest setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateInstanceRequestCreateInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateInstanceRequestCreateInstanceRequest setResourceSpec(CreateInstanceRequestCreateInstanceRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public CreateInstanceRequestCreateInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public CreateInstanceRequestCreateInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public CreateInstanceRequestCreateInstanceRequest setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateInstanceRequestCreateInstanceRequest setStorage(CreateInstanceRequestCreateInstanceRequestStorage storage) {
            this.storage = storage;
            return this;
        }
        public CreateInstanceRequestCreateInstanceRequestStorage getStorage() {
            return this.storage;
        }

    }

}
