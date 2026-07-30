// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTemplateRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DataDiskList")
    public java.util.List<ModifyTemplateRequestDataDiskList> dataDiskList;

    /**
     * <p>The default language that is set when the cloud computer starts. This parameter takes effect only when a system image is used to create the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DefaultLanguage")
    public String defaultLanguage;

    /**
     * <p>The description of the template. The description must meet the following requirements:</p>
     * <ul>
     * <li>The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain Chinese characters, letters, digits, spaces, and special characters. Line breaks are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud computer image. You can query the ID on the image management page. System images and custom images are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the global policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PostPaidAfterUsedUp")
    public Boolean postPaidAfterUsedUp;

    /**
     * <p>The region-specific template configurations. Multiple configurations are supported. The configuration that matches the specific region is used.</p>
     * <blockquote>
     * <p>A maximum of 20 region configurations are supported.</p>
     * </blockquote>
     */
    @NameInMap("RegionConfigList")
    public java.util.List<ModifyTemplateRequestRegionConfigList> regionConfigList;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-a5fqjjqaejt***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the cloud computer in key-value format. A maximum of 20 tags can be specified.</p>
     */
    @NameInMap("ResourceTagList")
    public java.util.List<ModifyTemplateRequestResourceTagList> resourceTagList;

    @NameInMap("SiteConfigList")
    public java.util.List<ModifyTemplateRequestSiteConfigList> siteConfigList;

    /**
     * <p>The type of the system cloud disk.</p>
     * <blockquote>
     * <p>Only high-frequency and GPU-accelerated cloud computer specifications support ESSD cloud disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AutoPL</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The size of the system cloud disk. Unit: GiB. Valid values: 40 to 500. The value must be a multiple of 10.</p>
     * <blockquote>
     * <p>The system cloud disk size cannot be smaller than the size of the configured image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b-0caoeogs88y*****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 126 characters in length and can contain letters and Chinese characters.</li>
     * <li>The name must start with a letter or a Chinese character. The name cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The name can contain letters, digits, Chinese characters, colons (:), underscores (_), or hyphens (-). Periods (.) are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>My cloud desktop template 001</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The configuration group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bcc-dweha*****</p>
     */
    @NameInMap("TimerGroupId")
    public String timerGroupId;

    @NameInMap("UserDuration")
    public Integer userDuration;

    public static ModifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateRequest self = new ModifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyTemplateRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyTemplateRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyTemplateRequest setDataDiskList(java.util.List<ModifyTemplateRequestDataDiskList> dataDiskList) {
        this.dataDiskList = dataDiskList;
        return this;
    }
    public java.util.List<ModifyTemplateRequestDataDiskList> getDataDiskList() {
        return this.dataDiskList;
    }

    public ModifyTemplateRequest setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public ModifyTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTemplateRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyTemplateRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyTemplateRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyTemplateRequest setPostPaidAfterUsedUp(Boolean postPaidAfterUsedUp) {
        this.postPaidAfterUsedUp = postPaidAfterUsedUp;
        return this;
    }
    public Boolean getPostPaidAfterUsedUp() {
        return this.postPaidAfterUsedUp;
    }

    public ModifyTemplateRequest setRegionConfigList(java.util.List<ModifyTemplateRequestRegionConfigList> regionConfigList) {
        this.regionConfigList = regionConfigList;
        return this;
    }
    public java.util.List<ModifyTemplateRequestRegionConfigList> getRegionConfigList() {
        return this.regionConfigList;
    }

    public ModifyTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyTemplateRequest setResourceTagList(java.util.List<ModifyTemplateRequestResourceTagList> resourceTagList) {
        this.resourceTagList = resourceTagList;
        return this;
    }
    public java.util.List<ModifyTemplateRequestResourceTagList> getResourceTagList() {
        return this.resourceTagList;
    }

    public ModifyTemplateRequest setSiteConfigList(java.util.List<ModifyTemplateRequestSiteConfigList> siteConfigList) {
        this.siteConfigList = siteConfigList;
        return this;
    }
    public java.util.List<ModifyTemplateRequestSiteConfigList> getSiteConfigList() {
        return this.siteConfigList;
    }

    public ModifyTemplateRequest setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
        this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
        return this;
    }
    public String getSystemDiskPerformanceLevel() {
        return this.systemDiskPerformanceLevel;
    }

    public ModifyTemplateRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public ModifyTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifyTemplateRequest setTimerGroupId(String timerGroupId) {
        this.timerGroupId = timerGroupId;
        return this;
    }
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    public ModifyTemplateRequest setUserDuration(Integer userDuration) {
        this.userDuration = userDuration;
        return this;
    }
    public Integer getUserDuration() {
        return this.userDuration;
    }

    public static class ModifyTemplateRequestDataDiskList extends TeaModel {
        /**
         * <p>The performance level of the data cloud disk. Default value: <code>AutoPL</code>.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data cloud disk. Unit: GiB. Valid values: 40 to 2040. The value must be a multiple of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ModifyTemplateRequestDataDiskList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateRequestDataDiskList self = new ModifyTemplateRequestDataDiskList();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateRequestDataDiskList setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyTemplateRequestDataDiskList setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ModifyTemplateRequestRegionConfigList extends TeaModel {
        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-709****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The region ID. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cloud computer specification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.8c16g</p>
         */
        @NameInMap("ResourceInstanceType")
        public String resourceInstanceType;

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-35fvn8m2*****</p>
         */
        @NameInMap("SnapshotPolicyId")
        public String snapshotPolicyId;

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-adjrehad1****</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>Specifies whether to enable cloud disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnable")
        public Boolean volumeEncryptionEnable;

        /**
         * <p>The ID of the KMS key used when cloud disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>a7b3c0c8-b3a2-4876-b1cc-116dddc9****</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static ModifyTemplateRequestRegionConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateRequestRegionConfigList self = new ModifyTemplateRequestRegionConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateRequestRegionConfigList setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ModifyTemplateRequestRegionConfigList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyTemplateRequestRegionConfigList setResourceInstanceType(String resourceInstanceType) {
            this.resourceInstanceType = resourceInstanceType;
            return this;
        }
        public String getResourceInstanceType() {
            return this.resourceInstanceType;
        }

        public ModifyTemplateRequestRegionConfigList setSnapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        public ModifyTemplateRequestRegionConfigList setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ModifyTemplateRequestRegionConfigList setVolumeEncryptionEnable(Boolean volumeEncryptionEnable) {
            this.volumeEncryptionEnable = volumeEncryptionEnable;
            return this;
        }
        public Boolean getVolumeEncryptionEnable() {
            return this.volumeEncryptionEnable;
        }

        public ModifyTemplateRequestRegionConfigList setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

    public static class ModifyTemplateRequestResourceTagList extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>design</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyTemplateRequestResourceTagList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateRequestResourceTagList self = new ModifyTemplateRequestResourceTagList();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateRequestResourceTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyTemplateRequestResourceTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyTemplateRequestSiteConfigList extends TeaModel {
        @NameInMap("AppRuleId")
        public String appRuleId;

        @NameInMap("SiteId")
        public String siteId;

        public static ModifyTemplateRequestSiteConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateRequestSiteConfigList self = new ModifyTemplateRequestSiteConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateRequestSiteConfigList setAppRuleId(String appRuleId) {
            this.appRuleId = appRuleId;
            return this;
        }
        public String getAppRuleId() {
            return this.appRuleId;
        }

        public ModifyTemplateRequestSiteConfigList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

    }

}
