// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponseBody extends TeaModel {
    @NameInMap("ImagePipeline")
    public DescribeImagePipelinesResponseBodyImagePipeline imagePipeline;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the return value, see the &quot;Usage notes&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image templates returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImagePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesResponseBody self = new DescribeImagePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesResponseBody setImagePipeline(DescribeImagePipelinesResponseBodyImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
        return this;
    }
    public DescribeImagePipelinesResponseBodyImagePipeline getImagePipeline() {
        return this.imagePipeline;
    }

    public DescribeImagePipelinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePipelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts extends TeaModel {
        @NameInMap("AddAccount")
        public java.util.List<String> addAccount;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts setAddAccount(java.util.List<String> addAccount) {
            this.addAccount = addAccount;
            return this;
        }
        public java.util.List<String> getAddAccount() {
            return this.addAccount;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions extends TeaModel {
        @NameInMap("ImageNameSuffix")
        public String imageNameSuffix;

        @NameInMap("RetainCloudAssistant")
        public Boolean retainCloudAssistant;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions setImageNameSuffix(String imageNameSuffix) {
            this.imageNameSuffix = imageNameSuffix;
            return this;
        }
        public String getImageNameSuffix() {
            return this.imageNameSuffix;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions setRetainCloudAssistant(Boolean retainCloudAssistant) {
            this.retainCloudAssistant = retainCloudAssistant;
            return this;
        }
        public Boolean getRetainCloudAssistant() {
            return this.retainCloudAssistant;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures extends TeaModel {
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags extends TeaModel {
        @NameInMap("ImageTag")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag> imageTag;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags setImageTag(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag> imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTagsImageTag> getImageTag() {
            return this.imageTag;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("ImageFeatures")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures imageFeatures;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageTags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags imageTags;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions setImageFeatures(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures imageFeatures) {
            this.imageFeatures = imageFeatures;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures getImageFeatures() {
            return this.imageFeatures;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions setImageTags(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags imageTags) {
            this.imageTags = imageTags;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageTags getImageTags() {
            return this.imageTags;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        @NameInMap("Format")
        public String format;

        @NameInMap("OSSBucket")
        public String OSSBucket;

        @NameInMap("OSSObject")
        public String OSSObject;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping setDiskImageSize(Integer diskImageSize) {
            this.diskImageSize = diskImageSize;
            return this;
        }
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping setOSSObject(String OSSObject) {
            this.OSSObject = OSSObject;
            return this;
        }
        public String getOSSObject() {
            return this.OSSObject;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures extends TeaModel {
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures setImdsSupport(String imdsSupport) {
            this.imdsSupport = imdsSupport;
            return this;
        }
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags extends TeaModel {
        @NameInMap("ImportImageTag")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag> importImageTag;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags setImportImageTag(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag> importImageTag) {
            this.importImageTag = importImageTag;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTagsImportImageTag> getImportImageTag() {
            return this.importImageTag;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("BootMode")
        public String bootMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskDeviceMappings")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings diskDeviceMappings;

        @NameInMap("Features")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures features;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImportImageTags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags importImageTags;

        @NameInMap("LicenseType")
        public String licenseType;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RetainImportedImage")
        public Boolean retainImportedImage;

        @NameInMap("RetentionStrategy")
        public String retentionStrategy;

        @NameInMap("RoleName")
        public String roleName;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setBootMode(String bootMode) {
            this.bootMode = bootMode;
            return this;
        }
        public String getBootMode() {
            return this.bootMode;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setDiskDeviceMappings(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setFeatures(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures features) {
            this.features = features;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures getFeatures() {
            return this.features;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setImportImageTags(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags importImageTags) {
            this.importImageTags = importImageTags;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsImportImageTags getImportImageTags() {
            return this.importImageTags;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setRetainImportedImage(Boolean retainImportedImage) {
            this.retainImportedImage = retainImportedImage;
            return this;
        }
        public Boolean getRetainImportedImage() {
            return this.retainImportedImage;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setRetentionStrategy(String retentionStrategy) {
            this.retentionStrategy = retentionStrategy;
            return this;
        }
        public String getRetentionStrategy() {
            return this.retentionStrategy;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> tag;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags setTag(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds extends TeaModel {
        @NameInMap("ToRegionId")
        public java.util.List<String> toRegionId;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds setToRegionId(java.util.List<String> toRegionId) {
            this.toRegionId = toRegionId;
            return this;
        }
        public java.util.List<String> getToRegionId() {
            return this.toRegionId;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet extends TeaModel {
        @NameInMap("AddAccounts")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts;

        @NameInMap("AdvancedOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions advancedOptions;

        @NameInMap("BaseImage")
        public String baseImage;

        @NameInMap("BaseImageType")
        public String baseImageType;

        @NameInMap("BuildContent")
        public String buildContent;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeleteInstanceOnFailure")
        public Boolean deleteInstanceOnFailure;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageFamily")
        @Deprecated
        public String imageFamily;

        @NameInMap("ImageName")
        @Deprecated
        public String imageName;

        @NameInMap("ImageOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions imageOptions;

        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        @NameInMap("ImportImageOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions importImageOptions;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("Name")
        public String name;

        @NameInMap("NvmeSupport")
        @Deprecated
        public String nvmeSupport;

        @NameInMap("RepairMode")
        public String repairMode;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Tags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags;

        @NameInMap("TestContent")
        public String testContent;

        @NameInMap("ToRegionIds")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setAddAccounts(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts) {
            this.addAccounts = addAccounts;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setAdvancedOptions(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImage(String baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public String getBaseImage() {
            return this.baseImage;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImageType(String baseImageType) {
            this.baseImageType = baseImageType;
            return this;
        }
        public String getBaseImageType() {
            return this.baseImageType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBuildContent(String buildContent) {
            this.buildContent = buildContent;
            return this;
        }
        public String getBuildContent() {
            return this.buildContent;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }
        public Boolean getDeleteInstanceOnFailure() {
            return this.deleteInstanceOnFailure;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        @Deprecated
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        @Deprecated
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageOptions(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions imageOptions) {
            this.imageOptions = imageOptions;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions getImageOptions() {
            return this.imageOptions;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImportImageOptions(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions importImageOptions) {
            this.importImageOptions = importImageOptions;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions getImportImageOptions() {
            return this.importImageOptions;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        @Deprecated
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setRepairMode(String repairMode) {
            this.repairMode = repairMode;
            return this;
        }
        public String getRepairMode() {
            return this.repairMode;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setTags(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags getTags() {
            return this.tags;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setTestContent(String testContent) {
            this.testContent = testContent;
            return this;
        }
        public String getTestContent() {
            return this.testContent;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setToRegionIds(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds) {
            this.toRegionIds = toRegionIds;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipeline extends TeaModel {
        @NameInMap("ImagePipelineSet")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> imagePipelineSet;

        public static DescribeImagePipelinesResponseBodyImagePipeline build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipeline self = new DescribeImagePipelinesResponseBodyImagePipeline();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipeline setImagePipelineSet(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> imagePipelineSet) {
            this.imagePipelineSet = imagePipelineSet;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> getImagePipelineSet() {
            return this.imagePipelineSet;
        }

    }

}
