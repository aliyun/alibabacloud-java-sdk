// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
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
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter does not take effect for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>POST: pay-as-you-go.</li>
     * <li>PRE: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The subscription duration.</p>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The extended field.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether to use zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
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
    public CreateInstanceRequestHaResourceSpec haResourceSpec;

    /**
     * <p>The list of vSwitch IDs in the secondary zone for zone-disaster recovery.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <p>The workspace name. The name must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-). The name cannot end with a hyphen.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-e2e-test-pre</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of monitoring and alerting service. You can select ARMS or CloudMonitor.</p>
     * 
     * <strong>example:</strong>
     * <p>TAIHAO</p>
     */
    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>year</strong>: year.</li>
     * <li><strong>month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
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
     * <p>500043499350689</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxbavps3rpiy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource specifications.</p>
     * <blockquote>
     * <p>This parameter is required when ChargeType is set to PRE.</p>
     * </blockquote>
     */
    @NameInMap("ResourceSpec")
    public CreateInstanceRequestResourceSpec resourceSpec;

    /**
     * <p>The storage parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Storage")
    public CreateInstanceRequestStorage storage;

    /**
     * <p>The list of tags. A maximum of 20 tags can be specified.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li>true: Use a coupon.</li>
     * <li>false: Do not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    /**
     * <p>The list of vSwitch IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze9xoh8qyt1rnxfmfcdi</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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

    public static class CreateInstanceRequestHaResourceSpec extends TeaModel {
        /**
         * <p>The number of CPUs for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
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
        /**
         * <p>The number of CPUs.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for subscription workspaces. For pay-as-you-go workspaces, you do not need to specify this parameter.- The number of CPUs for the target project must be less than the remaining CPUs in the workspace (total purchased CPUs minus CPUs already allocated to other projects). Otherwise, an error is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size. Unit: GB.</p>
         * <blockquote>
         * <p>The memory size must be 4 times the number of CPUs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
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
        /**
         * <p>The name of the OSS bucket to bind.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-flink-cn-shanghai-260343971602724445</p>
         */
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
        /**
         * <p>Specifies whether to use fully managed storage. You can select only one of fully managed storage or binding an OSS bucket. Valid values:</p>
         * <ul>
         * <li>true: Use fully managed storage.</li>
         * <li>false: Do not use fully managed storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FullyManaged")
        public Boolean fullyManaged;

        /**
         * <p>The Object Storage Service (OSS) storage.</p>
         */
        @NameInMap("Oss")
        public CreateInstanceRequestStorageOss oss;

        public static CreateInstanceRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestStorage self = new CreateInstanceRequestStorage();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestStorage setFullyManaged(Boolean fullyManaged) {
            this.fullyManaged = fullyManaged;
            return this;
        }
        public Boolean getFullyManaged() {
            return this.fullyManaged;
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
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
