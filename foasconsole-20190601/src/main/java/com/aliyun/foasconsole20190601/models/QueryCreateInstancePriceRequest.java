// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateInstanceRequest")
    public QueryCreateInstancePriceRequestCreateInstanceRequest createInstanceRequest;

    public static QueryCreateInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceRequest self = new QueryCreateInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceRequest setCreateInstanceRequest(QueryCreateInstancePriceRequestCreateInstanceRequest createInstanceRequest) {
        this.createInstanceRequest = createInstanceRequest;
        return this;
    }
    public QueryCreateInstancePriceRequestCreateInstanceRequest getCreateInstanceRequest() {
        return this.createInstanceRequest;
    }

    public static class QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec self = new QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec extends TeaModel {
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

        public static QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec self = new QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss_flink</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        public static QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss self = new QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCreateInstancePriceRequestCreateInstanceRequestStorage extends TeaModel {
        @NameInMap("Oss")
        public QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss oss;

        public static QueryCreateInstancePriceRequestCreateInstanceRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestCreateInstanceRequestStorage self = new QueryCreateInstancePriceRequestCreateInstanceRequestStorage();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequestStorage setOss(QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public QueryCreateInstancePriceRequestCreateInstanceRequestStorageOss getOss() {
            return this.oss;
        }

    }

    public static class QueryCreateInstancePriceRequestCreateInstanceRequest extends TeaModel {
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

        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaResourceSpec")
        public QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec haResourceSpec;

        /**
         * <strong>example:</strong>
         * <p>vvp1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <strong>example:</strong>
         * <p>5ef***</p>
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

        @NameInMap("ResourceSpec")
        public QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec resourceSpec;

        @NameInMap("Storage")
        public QueryCreateInstancePriceRequestCreateInstanceRequestStorage storage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UsePromotionCode")
        public Boolean usePromotionCode;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9*******nxfmfcdi</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryCreateInstancePriceRequestCreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestCreateInstanceRequest self = new QueryCreateInstancePriceRequestCreateInstanceRequest();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setHaResourceSpec(QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec haResourceSpec) {
            this.haResourceSpec = haResourceSpec;
            return this;
        }
        public QueryCreateInstancePriceRequestCreateInstanceRequestHaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setResourceSpec(QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public QueryCreateInstancePriceRequestCreateInstanceRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setStorage(QueryCreateInstancePriceRequestCreateInstanceRequestStorage storage) {
            this.storage = storage;
            return this;
        }
        public QueryCreateInstancePriceRequestCreateInstanceRequestStorage getStorage() {
            return this.storage;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setUsePromotionCode(Boolean usePromotionCode) {
            this.usePromotionCode = usePromotionCode;
            return this;
        }
        public Boolean getUsePromotionCode() {
            return this.usePromotionCode;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCreateInstancePriceRequestCreateInstanceRequest setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
