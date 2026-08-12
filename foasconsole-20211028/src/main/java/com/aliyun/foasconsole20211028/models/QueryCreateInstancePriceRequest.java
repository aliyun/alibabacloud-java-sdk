// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceRequest extends TeaModel {
    /**
     * <p>The processor architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: does not enable auto-renewal. (Default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is invalid for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing type. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of billing cycles.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The extended reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether to select zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>The zone-disaster recovery resource specifications.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaResourceSpec")
    public QueryCreateInstancePriceRequestHaResourceSpec haResourceSpec;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-e2e-test-post</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The billing cycle. Subscription instances support only Year and Month. Pay-as-you-go instances support Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>500041860100636</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource specifications.</p>
     */
    @NameInMap("ResourceSpec")
    public QueryCreateInstancePriceRequestResourceSpec resourceSpec;

    /**
     * <p>The storage information.</p>
     */
    @NameInMap("Storage")
    public QueryCreateInstancePriceRequestStorage storage;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    /**
     * <p>The vSwitch IDs.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The VPC ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze9xoh8qyt1rnxfmfcdi</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static QueryCreateInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceRequest self = new QueryCreateInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
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

    public QueryCreateInstancePriceRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryCreateInstancePriceRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public QueryCreateInstancePriceRequest setHaResourceSpec(QueryCreateInstancePriceRequestHaResourceSpec haResourceSpec) {
        this.haResourceSpec = haResourceSpec;
        return this;
    }
    public QueryCreateInstancePriceRequestHaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
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

    public QueryCreateInstancePriceRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
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

    public static class QueryCreateInstancePriceRequestHaResourceSpec extends TeaModel {
        /**
         * <p>The number of CPUs for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The active memory size for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryCreateInstancePriceRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceRequestHaResourceSpec self = new QueryCreateInstancePriceRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryCreateInstancePriceRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryCreateInstancePriceRequestResourceSpec extends TeaModel {
        /**
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
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
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>quicktracing</p>
         */
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
        /**
         * <p>The OSS storage information.</p>
         */
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
