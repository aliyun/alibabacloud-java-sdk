// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("PromotionCode")
    public String promotionCode;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public QueryCreateInstancePriceRequestResourceSpec resourceSpec;

    @NameInMap("Storage")
    public QueryCreateInstancePriceRequestStorage storage;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static QueryCreateInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceRequest self = new QueryCreateInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public QueryCreateInstancePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public QueryCreateInstancePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryCreateInstancePriceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public QueryCreateInstancePriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryCreateInstancePriceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public QueryCreateInstancePriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryCreateInstancePriceRequest setResourceSpec(QueryCreateInstancePriceRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public QueryCreateInstancePriceRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public QueryCreateInstancePriceRequest setStorage(QueryCreateInstancePriceRequestStorage storage) {
        this.storage = storage;
        return this;
    }
    public QueryCreateInstancePriceRequestStorage getStorage() {
        return this.storage;
    }

    public QueryCreateInstancePriceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public QueryCreateInstancePriceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QueryCreateInstancePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class QueryCreateInstancePriceRequestResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryCreateInstancePriceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestResourceSpec self = new QueryCreateInstancePriceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryCreateInstancePriceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryCreateInstancePriceRequestStorageOss extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        public static QueryCreateInstancePriceRequestStorageOss build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestStorageOss self = new QueryCreateInstancePriceRequestStorageOss();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCreateInstancePriceRequestStorage extends TeaModel {
        @NameInMap("Oss")
        public QueryCreateInstancePriceRequestStorageOss oss;

        public static QueryCreateInstancePriceRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestStorage self = new QueryCreateInstancePriceRequestStorage();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestStorage setOss(QueryCreateInstancePriceRequestStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public QueryCreateInstancePriceRequestStorageOss getOss() {
            return this.oss;
        }

    }

}
