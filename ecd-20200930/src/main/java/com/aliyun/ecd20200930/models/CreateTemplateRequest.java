// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>Indicates whether automatic payment is enabled for the subscription order.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription cloud computer.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The billing method of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The size and specification configurations of data disks.</p>
     */
    @NameInMap("DataDiskList")
    public java.util.List<CreateTemplateRequestDataDiskList> dataDiskList;

    /**
     * <p>The default language set when the cloud computer starts. This parameter takes effect only when a system image is used to create the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DefaultLanguage")
    public String defaultLanguage;

    /**
     * <p>The description of the template. The description must meet the following requirements:</p>
     * <ul>
     * <li>The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain Chinese characters, letters, digits, spaces, and special characters. Line breaks are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DesignDepartmentTemplate</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud computer image. You can query the ID on the image management page. System images and custom images are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>desktopimage-windows-server-2022-64-asp</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The subscription duration of the subscription cloud computer. This parameter takes effect and is required only when <code>ChargeType</code> is set to <code>PrePaid</code>. The unit is specified by <code>PeriodUnit</code>.</p>
     * <ul>
     * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values:<ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values:<ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription billable methods duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the global policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-8hlryfn331******</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>Specifies whether to automatically switch to pay-as-you-go billing after the duration plan is used up.</p>
     */
    @NameInMap("PostPaidAfterUsedUp")
    public Boolean postPaidAfterUsedUp;

    /**
     * <p>The product type. Set the value to <code>CloudDesktop</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region-specific template configurations. You can specify multiple configurations. The configuration that matches the specific region is used.</p>
     * <blockquote>
     * <p>You can specify configurations for up to 20 regions.</p>
     * </blockquote>
     */
    @NameInMap("RegionConfigList")
    public java.util.List<CreateTemplateRequestRegionConfigList> regionConfigList;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4knxmfneq1e******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the cloud computer in key-value format. You can specify up to 20 tags.</p>
     */
    @NameInMap("ResourceTagList")
    public java.util.List<CreateTemplateRequestResourceTagList> resourceTagList;

    /**
     * <p>The site configuration management.</p>
     */
    @NameInMap("SiteConfigList")
    public java.util.List<CreateTemplateRequestSiteConfigList> siteConfigList;

    /**
     * <p>The type of the system disk.</p>
     * <blockquote>
     * <p>Only high-frequency and GPU-accelerated cloud computer specifications support ESSD disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AutoPL</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GiB. Valid values: 40 to 500. The value must be a multiple of 10.</p>
     * <blockquote>
     * <p>The system disk size cannot be smaller than the image size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The name of the template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 126 characters in length.</li>
     * <li>The name must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The name can contain letters, digits, Chinese characters, colons (:), underscores (_), or hyphens (-). Periods (.) are not supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCloudComputerTemplate001</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The configuration group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0caoeogrk9m5****</p>
     */
    @NameInMap("TimerGroupId")
    public String timerGroupId;

    /**
     * <p>The usage duration plan per user.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("UserDuration")
    public Integer userDuration;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateTemplateRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateTemplateRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateTemplateRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTemplateRequest setDataDiskList(java.util.List<CreateTemplateRequestDataDiskList> dataDiskList) {
        this.dataDiskList = dataDiskList;
        return this;
    }
    public java.util.List<CreateTemplateRequestDataDiskList> getDataDiskList() {
        return this.dataDiskList;
    }

    public CreateTemplateRequest setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateTemplateRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateTemplateRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateTemplateRequest setPostPaidAfterUsedUp(Boolean postPaidAfterUsedUp) {
        this.postPaidAfterUsedUp = postPaidAfterUsedUp;
        return this;
    }
    public Boolean getPostPaidAfterUsedUp() {
        return this.postPaidAfterUsedUp;
    }

    public CreateTemplateRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateTemplateRequest setRegionConfigList(java.util.List<CreateTemplateRequestRegionConfigList> regionConfigList) {
        this.regionConfigList = regionConfigList;
        return this;
    }
    public java.util.List<CreateTemplateRequestRegionConfigList> getRegionConfigList() {
        return this.regionConfigList;
    }

    public CreateTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTemplateRequest setResourceTagList(java.util.List<CreateTemplateRequestResourceTagList> resourceTagList) {
        this.resourceTagList = resourceTagList;
        return this;
    }
    public java.util.List<CreateTemplateRequestResourceTagList> getResourceTagList() {
        return this.resourceTagList;
    }

    public CreateTemplateRequest setSiteConfigList(java.util.List<CreateTemplateRequestSiteConfigList> siteConfigList) {
        this.siteConfigList = siteConfigList;
        return this;
    }
    public java.util.List<CreateTemplateRequestSiteConfigList> getSiteConfigList() {
        return this.siteConfigList;
    }

    public CreateTemplateRequest setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
        this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
        return this;
    }
    public String getSystemDiskPerformanceLevel() {
        return this.systemDiskPerformanceLevel;
    }

    public CreateTemplateRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setTimerGroupId(String timerGroupId) {
        this.timerGroupId = timerGroupId;
        return this;
    }
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    public CreateTemplateRequest setUserDuration(Integer userDuration) {
        this.userDuration = userDuration;
        return this;
    }
    public Integer getUserDuration() {
        return this.userDuration;
    }

    public static class CreateTemplateRequestDataDiskList extends TeaModel {
        /**
         * <p>The performance level of the data disk. Default value: <code>AutoPL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoPL</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data cloud disk. Unit: GiB. Valid values: 40 to 2040. The value must be a multiple of 10.</p>
         * <blockquote>
         * <p>Notice: The larger the ESSD cloud disk capacity, the higher the performance level (PL) available (for example, PL2 is available for capacities of 460 GiB or more). Higher performance levels (PLs) incur higher costs. Select the ESSD cloud disk performance level (PL) based on your requirements. Note: Only standard SSD and ESSD cloud disks are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateTemplateRequestDataDiskList build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestDataDiskList self = new CreateTemplateRequestDataDiskList();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestDataDiskList setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateTemplateRequestDataDiskList setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateTemplateRequestRegionConfigList extends TeaModel {
        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-709******</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>sp-35fvn8m21pnx2****</p>
         */
        @NameInMap("SnapshotPolicyId")
        public String snapshotPolicyId;

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1yiu**********</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnable")
        public Boolean volumeEncryptionEnable;

        /**
         * <p>The ID of the KMS key used when disk encryption is enabled. You can call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to obtain the key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a7b3c0c8-b3a2-4876-b1cc-*********</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static CreateTemplateRequestRegionConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestRegionConfigList self = new CreateTemplateRequestRegionConfigList();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestRegionConfigList setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public CreateTemplateRequestRegionConfigList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateTemplateRequestRegionConfigList setResourceInstanceType(String resourceInstanceType) {
            this.resourceInstanceType = resourceInstanceType;
            return this;
        }
        public String getResourceInstanceType() {
            return this.resourceInstanceType;
        }

        public CreateTemplateRequestRegionConfigList setSnapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        public CreateTemplateRequestRegionConfigList setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public CreateTemplateRequestRegionConfigList setVolumeEncryptionEnable(Boolean volumeEncryptionEnable) {
            this.volumeEncryptionEnable = volumeEncryptionEnable;
            return this;
        }
        public Boolean getVolumeEncryptionEnable() {
            return this.volumeEncryptionEnable;
        }

        public CreateTemplateRequestRegionConfigList setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

    public static class CreateTemplateRequestResourceTagList extends TeaModel {
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

        public static CreateTemplateRequestResourceTagList build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestResourceTagList self = new CreateTemplateRequestResourceTagList();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestResourceTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateRequestResourceTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTemplateRequestSiteConfigList extends TeaModel {
        /**
         * <p>The application control policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bwr-5a5371e0db954d********</p>
         */
        @NameInMap("AppRuleId")
        public String appRuleId;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mainland</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        public static CreateTemplateRequestSiteConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestSiteConfigList self = new CreateTemplateRequestSiteConfigList();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestSiteConfigList setAppRuleId(String appRuleId) {
            this.appRuleId = appRuleId;
            return this;
        }
        public String getAppRuleId() {
            return this.appRuleId;
        }

        public CreateTemplateRequestSiteConfigList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

    }

}
