// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: the Enterprise edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDiskList")
    public java.util.List<CreateTemplateRequestDataDiskList> dataDiskList;

    /**
     * <p>The default language of cloud computers during startup. This parameter takes effect only when cloud computers are created from system images.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DefaultLanguage")
    public String defaultLanguage;

    /**
     * <p>The template description. It must meet the following criteria:</p>
     * <ul>
     * <li>It can be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain letters, digits, and special characters, including spaces. Note: You can use carriage returns to break lines.</li>
     * </ul>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud computer image. You can query image IDs on the Images page. System images and custom images are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>desktopimage-windows-server-2022-64-asp</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy group.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-8hlryfn331******</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PostPaidAfterUsedUp")
    public Boolean postPaidAfterUsedUp;

    /**
     * <p>The service type. Set the value to <code>CloudDesktop</code>.</p>
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The regions of the template. You can create cloud computers by using a template only within the same region as the template itself.</p>
     * <blockquote>
     * <p> You can specify up to 20 regions.</p>
     * </blockquote>
     */
    @NameInMap("RegionConfigList")
    public java.util.List<CreateTemplateRequestRegionConfigList> regionConfigList;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4knxmfneq1e******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags added to cloud computers. Specify tags in key-value pairs. You can specify up to 20 tags.</p>
     */
    @NameInMap("ResourceTagList")
    public java.util.List<CreateTemplateRequestResourceTagList> resourceTagList;

    /**
     * <p>区域配置管理</p>
     */
    @NameInMap("SiteConfigList")
    public java.util.List<CreateTemplateRequestSiteConfigList> siteConfigList;

    /**
     * <p>The performance level (PL) of the system disk.</p>
     * <blockquote>
     * <p> Only cloud computers of the Graphics or High Frequency type support Enterprise SSDs (ESSDs).</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>PL1: a PL1 ESSD.</li>
     * <li>PL0: a PL0 ESSD.</li>
     * <li>AutoPL: an AutoPL ESSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoPL</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GiB. Valid values: 40 to 500. Increments: 10 GiB.</p>
     * <blockquote>
     * <p> The system disk size must be at least as large as the configured image size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The template name. It must meet the following criteria:</p>
     * <ul>
     * <li>It can be 2 to 126 characters in length.</li>
     * <li>It must begin with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain letters, digits, colons (:), underscores (_), and hyphens (-). Note: Periods (.) are not supported in the name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0caoeogrk9m5****</p>
     */
    @NameInMap("TimerGroupId")
    public String timerGroupId;

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
         * <p>The PL of the data disk. Default value: <code>AutoPL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoPL</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Unit: GiB. Valid values: 40 to 2040. Increments: 10 GiB.</p>
         * <p>**</p>
         * <p><strong>Keep in mind</strong> that the larger the ESSD disk capacity, the higher the available PL (for example, PL2 is available for disks larger than 460 GiB). A higher PL comes with a higher cost. Select an ESSD based on your specific needs.</p>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the cloud computer type.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>false (default): disables disk encryption.</li>
         * <li>true: enables disk encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnable")
        public Boolean volumeEncryptionEnable;

        /**
         * <p>The ID of the Key Management Service (KMS) key that you want to use to encrypt disks. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query KMS keys.</p>
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
         * <p>应用管控策略ID</p>
         * 
         * <strong>example:</strong>
         * <p>bwr-5a5371e0db954d********</p>
         */
        @NameInMap("AppRuleId")
        public String appRuleId;

        /**
         * <p>站点ID。</p>
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
