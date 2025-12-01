// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    /**
     * <p>The modification result. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The templates.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTemplatesResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned. This parameter is not returned if the value of Code is <code>success</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1871984F-51F6-5588-BAF6-*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTemplatesResponseBody setData(java.util.List<DescribeTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTemplatesResponseBodyDataDataDiskList extends TeaModel {
        /**
         * <p>The PL of the data disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL1: a PL1 ESSD.</li>
         * <li>PL0: a PL0 ESSD.</li>
         * <li>AutoPL: an AutoPL SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoPL</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public String size;

        public static DescribeTemplatesResponseBodyDataDataDiskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyDataDataDiskList self = new DescribeTemplatesResponseBodyDataDataDiskList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyDataDataDiskList setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeTemplatesResponseBodyDataDataDiskList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeTemplatesResponseBodyDataRegionConfigList extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuCount")
        public Integer cpuCount;

        /**
         * <p>The GPU memory information. This parameter is supported only by Graphics cloud computer types.</p>
         * 
         * <strong>example:</strong>
         * <p>4GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public Long memorySize;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing+dir-3040*****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the cloud computer type.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.4c8g</p>
         */
        @NameInMap("ResourceInstanceType")
        public String resourceInstanceType;

        /**
         * <p>The snapshot policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-b9fasjuu0*****</p>
         */
        @NameInMap("SnapshotPolicyId")
        public String snapshotPolicyId;

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-dgea1*****</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnable")
        public Boolean volumeEncryptionEnable;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>3bc77be0-cbce-4a29-b07b-13f16394****</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeTemplatesResponseBodyDataRegionConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyDataRegionConfigList self = new DescribeTemplatesResponseBodyDataRegionConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setMemorySize(Long memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Long getMemorySize() {
            return this.memorySize;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setResourceInstanceType(String resourceInstanceType) {
            this.resourceInstanceType = resourceInstanceType;
            return this;
        }
        public String getResourceInstanceType() {
            return this.resourceInstanceType;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setSnapshotPolicyId(String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setVolumeEncryptionEnable(Boolean volumeEncryptionEnable) {
            this.volumeEncryptionEnable = volumeEncryptionEnable;
            return this;
        }
        public Boolean getVolumeEncryptionEnable() {
            return this.volumeEncryptionEnable;
        }

        public DescribeTemplatesResponseBodyDataRegionConfigList setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

    public static class DescribeTemplatesResponseBodyDataResourceTagList extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTemplatesResponseBodyDataResourceTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyDataResourceTagList self = new DescribeTemplatesResponseBodyDataResourceTagList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyDataResourceTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTemplatesResponseBodyDataResourceTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTemplatesResponseBodyDataSiteConfigList extends TeaModel {
        /**
         * <p>应用管控策略ID</p>
         * 
         * <strong>example:</strong>
         * <p>bwr-5a5371e0*******</p>
         */
        @NameInMap("AppRuleId")
        public String appRuleId;

        /**
         * <p>站点名称。</p>
         * 
         * <strong>example:</strong>
         * <p>mainland</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        public static DescribeTemplatesResponseBodyDataSiteConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyDataSiteConfigList self = new DescribeTemplatesResponseBodyDataSiteConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyDataSiteConfigList setAppRuleId(String appRuleId) {
            this.appRuleId = appRuleId;
            return this;
        }
        public String getAppRuleId() {
            return this.appRuleId;
        }

        public DescribeTemplatesResponseBodyDataSiteConfigList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

    }

    public static class DescribeTemplatesResponseBodyData extends TeaModel {
        @NameInMap("AutoPay")
        public Boolean autoPay;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The sizes of the data disks.</p>
         */
        @NameInMap("DataDiskList")
        public java.util.List<DescribeTemplatesResponseBodyDataDataDiskList> dataDiskList;

        /**
         * <p>The default language of the template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>en-US: English.</li>
         * <li>zh-HK: Chinese, Traditional (Hong Kong, China).</li>
         * <li>zh-CN: Simplified Chinese.</li>
         * <li>ja-JP: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("DefaultLanguage")
        public String defaultLanguage;

        /**
         * <p>The template description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T05:18:46.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the template was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T05:18:46.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5q8ehbihx*****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>User: a custom image.</li>
         * <li>Shared: a shared image.</li>
         * <li>System: a system image.</li>
         * <li>Community: a community image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0caoeogkhz*****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PostPaidAfterUsedUp")
        public Boolean postPaidAfterUsedUp;

        /**
         * <p>The service type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudDesktop: cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The region-related settings.</p>
         */
        @NameInMap("RegionConfigList")
        public java.util.List<DescribeTemplatesResponseBodyDataRegionConfigList> regionConfigList;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1871984F-51F6-5588-BAF6-******</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-a5fqjjqaejt***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags added to cloud computers. A tag is a key-value pair.</p>
         */
        @NameInMap("ResourceTagList")
        public java.util.List<DescribeTemplatesResponseBodyDataResourceTagList> resourceTagList;

        /**
         * <p>区域配置管理</p>
         */
        @NameInMap("SiteConfigList")
        public java.util.List<DescribeTemplatesResponseBodyDataSiteConfigList> siteConfigList;

        /**
         * <p>The performance level (PL) of the system disk.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>PL1: a PL1 Enterprise SSD (ESSD).</li>
         * <li>PL0: a PL0 ESSD.</li>
         * <li>AutoPL: an AutoPL SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoPL</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b-0caoeogs88y*****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The template type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>USER_TEMPLATE: custom templates.</li>
         * <li>SYSTEM_TEMPLATE: system templates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_TEMPLATE</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>bcc-dweha*****</p>
         */
        @NameInMap("TimerGroupId")
        public String timerGroupId;

        @NameInMap("UserDuration")
        public String userDuration;

        public static DescribeTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyData self = new DescribeTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyData setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeTemplatesResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeTemplatesResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeTemplatesResponseBodyData setDataDiskList(java.util.List<DescribeTemplatesResponseBodyDataDataDiskList> dataDiskList) {
            this.dataDiskList = dataDiskList;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyDataDataDiskList> getDataDiskList() {
            return this.dataDiskList;
        }

        public DescribeTemplatesResponseBodyData setDefaultLanguage(String defaultLanguage) {
            this.defaultLanguage = defaultLanguage;
            return this;
        }
        public String getDefaultLanguage() {
            return this.defaultLanguage;
        }

        public DescribeTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplatesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeTemplatesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeTemplatesResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeTemplatesResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeTemplatesResponseBodyData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeTemplatesResponseBodyData setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeTemplatesResponseBodyData setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeTemplatesResponseBodyData setPostPaidAfterUsedUp(Boolean postPaidAfterUsedUp) {
            this.postPaidAfterUsedUp = postPaidAfterUsedUp;
            return this;
        }
        public Boolean getPostPaidAfterUsedUp() {
            return this.postPaidAfterUsedUp;
        }

        public DescribeTemplatesResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeTemplatesResponseBodyData setRegionConfigList(java.util.List<DescribeTemplatesResponseBodyDataRegionConfigList> regionConfigList) {
            this.regionConfigList = regionConfigList;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyDataRegionConfigList> getRegionConfigList() {
            return this.regionConfigList;
        }

        public DescribeTemplatesResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeTemplatesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeTemplatesResponseBodyData setResourceTagList(java.util.List<DescribeTemplatesResponseBodyDataResourceTagList> resourceTagList) {
            this.resourceTagList = resourceTagList;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyDataResourceTagList> getResourceTagList() {
            return this.resourceTagList;
        }

        public DescribeTemplatesResponseBodyData setSiteConfigList(java.util.List<DescribeTemplatesResponseBodyDataSiteConfigList> siteConfigList) {
            this.siteConfigList = siteConfigList;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyDataSiteConfigList> getSiteConfigList() {
            return this.siteConfigList;
        }

        public DescribeTemplatesResponseBodyData setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeTemplatesResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeTemplatesResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeTemplatesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeTemplatesResponseBodyData setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplatesResponseBodyData setTimerGroupId(String timerGroupId) {
            this.timerGroupId = timerGroupId;
            return this;
        }
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        public DescribeTemplatesResponseBodyData setUserDuration(String userDuration) {
            this.userDuration = userDuration;
            return this;
        }
        public String getUserDuration() {
            return this.userDuration;
        }

    }

}
