// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponseBody extends TeaModel {
    /**
     * <p>Details about the image templates.</p>
     */
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
        /**
         * <p>Indicates whether to disable the feature that automatically adds a suffix to the name of the image created based on the image template. Valid value:</p>
         * <ul>
         * <li>disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("ImageNameSuffix")
        public String imageNameSuffix;

        /**
         * <p>Indicates whether to retain Cloud Assistant. During the image building process, the system automatically installs Cloud Assistant in the intermediate instance to run commands. You can choose whether to retain Cloud Assistant in the new image created based on the image template. Valid values:</p>
         * <ul>
         * <li>true: retains Cloud Assistant.</li>
         * <li>false: does not retain Cloud Assistant.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter does not affect Cloud Assistant that comes with your image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Indicates whether the image supports the NVMe protocol. Valid values:</p>
         * <ul>
         * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
         * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
         * <li>auto: The system automatically checks whether the image supports the NVMe protocol. The system automatically checks whether the NVMe driver is installed on your image before the image is built. If you install or uninstall the NVMe driver during the image building task, the check result may be incorrect. We recommend that you set the value to supported or unsupported based on the image building content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
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
        /**
         * <p>The tag key of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
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
        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image family.</p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The feature attributes of the image.</p>
         */
        @NameInMap("ImageFeatures")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptionsImageFeatures imageFeatures;

        /**
         * <p>The prefix of the image name.</p>
         * 
         * <strong>example:</strong>
         * <p>imageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The tags of the image.</p>
         */
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
        /**
         * <p>The size of disk N in the custom image after the image is imported.</p>
         * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the source image file. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>When N is set to 1, this parameter indicates the size of the system disk in the custom image. Valid values: 1 to 2048.</li>
         * <li>When N is set to an integer in the range of 2 to 17, this parameter indicates the size of a data disk in the custom image. Valid values: 1 to 2048.</li>
         * </ul>
         * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The format of the image. Valid values:</p>
         * <ul>
         * <li>RAW</li>
         * <li>VHD</li>
         * <li>QCOW2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The Object Storage Service (OSS) bucket where the image file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The name (key) of the object that the image file is stored as in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_5.4_32.raw</p>
         */
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
        /**
         * <p>Indicates whether the image supports the NVMe protocol. Valid values:</p>
         * <ul>
         * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
         * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions extends TeaModel {
        /**
         * <p>The operating system architecture. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The boot mode of the image. Valid values:</p>
         * <ul>
         * <li>BIOS: BIOS mode</li>
         * <li>UEFI: Unified Extensible Firmware Interface (UEFI) mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        /**
         * <p>The information of disks from which the custom images are created.</p>
         * <ul>
         * <li>When the value of N is 1, a custom image is created from the system disk.</li>
         * <li>When the value of N is an integer in the range of 2 to 17, a custom image is created from a data disk.</li>
         * </ul>
         */
        @NameInMap("DiskDeviceMappings")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsDiskDeviceMappings diskDeviceMappings;

        /**
         * <p>The feature attributes of the image.</p>
         */
        @NameInMap("Features")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptionsFeatures features;

        /**
         * <p>The type of the license to use to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: ECS detects the operating system of the image and allocates a license to the operating system In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is specified in the <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is specified, the system allocates the license to the imported image. If no such license is specified, the Bring Your Own License (BYOL) mode is used.</li>
         * <li>Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by <code>Platform</code>.</li>
         * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("LicenseType")
        public String licenseType;

        /**
         * <p>The operating system type. Valid values:</p>
         * <ul>
         * <li>windows: Windows operating systems</li>
         * <li>linux: Linux operating systems</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The version of the operating system. Valid values:</p>
         * <ul>
         * <li>Aliyun</li>
         * <li>Anolis</li>
         * <li>CentOS</li>
         * <li>Ubuntu</li>
         * <li>CoreOS</li>
         * <li>SUSE</li>
         * <li>Debian</li>
         * <li>OpenSUSE</li>
         * <li>FreeBSD</li>
         * <li>RedHat</li>
         * <li>Kylin</li>
         * <li>UOS</li>
         * <li>Fedora</li>
         * <li>Fedora CoreOS</li>
         * <li>CentOS Stream</li>
         * <li>AlmaLinux</li>
         * <li>Rocky Linux</li>
         * <li>Gentoo</li>
         * <li>Customized Linux</li>
         * <li>Others Linux</li>
         * <li>Windows Server 2022</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
         * <li>Windows Server 2012</li>
         * <li>Windows Server 2008</li>
         * <li>Windows Server 2003</li>
         * <li>Other Windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetainImportedImage")
        public Boolean retainImportedImage;

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

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template.</p>
         */
        @NameInMap("AddAccounts")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts;

        /**
         * <p>The advanced settings.</p>
         */
        @NameInMap("AdvancedOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAdvancedOptions advancedOptions;

        /**
         * <p>The source image.</p>
         * <ul>
         * <li>When <code>BaseImageType</code> is set to IMAGE, the value of this parameter is the ID of a custom image.</li>
         * <li>When <code>BaseImageType</code> is set to IMAGE_FAMILY, the value of this parameter is the name of an image family.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        @NameInMap("BaseImage")
        public String baseImage;

        /**
         * <p>The type of the source image. Valid values:</p>
         * <ul>
         * <li>IMAGE: custom image</li>
         * <li>IMAGE_FAMILY: image family</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("BaseImageType")
        public String baseImageType;

        /**
         * <p>The content of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM IMAGE:m-bp67acfmxazb4p****</p>
         */
        @NameInMap("BuildContent")
        public String buildContent;

        /**
         * <p>The time when the image template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-24T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether to release the intermediate instance when the image fails to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteInstanceOnFailure")
        public Boolean deleteInstanceOnFailure;

        /**
         * <p>The description of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The family of the image created based on the image template.</p>
         * <blockquote>
         * <p> This parameter is no longer used. We recommend that you use ImageOptions.ImageFamily.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ImageFamily")
        @Deprecated
        public String imageFamily;

        /**
         * <p>The name prefix of the image created based on the image template.</p>
         * <blockquote>
         * <p> This parameter is no longer used. We recommend that you use ImageOptions.ImageName.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        @Deprecated
        public String imageName;

        /**
         * <p>The attributes of the image created based on the image template.</p>
         */
        @NameInMap("ImageOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImageOptions imageOptions;

        /**
         * <p>The ID of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>ip-2ze5tsl5bp6nf2b3****</p>
         */
        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        /**
         * <p>The attributes and settings of the imported image.</p>
         */
        @NameInMap("ImportImageOptions")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetImportImageOptions importImageOptions;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The name of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>testImagePipeline</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the image created based on the image template supports the Non-Volatile Memory Express (NVMe) protocol.</p>
         * <blockquote>
         * <p> This parameter is no longer used. We recommend that you use ImageOptions.ImageFeatures.NvmeSupport.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("NvmeSupport")
        @Deprecated
        public String nvmeSupport;

        /**
         * <p>The repair mode of the image template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RepairMode")
        public String repairMode;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The system disk size of the intermediate instance. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags of the image template.</p>
         */
        @NameInMap("Tags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags;

        /**
         * <p>The content of the image test template.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TestContent")
        public String testContent;

        /**
         * <p>The IDs of regions to which to distribute the image that will be created based on the image template.</p>
         */
        @NameInMap("ToRegionIds")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds;

        /**
         * <p>The ID of the vSwitch in the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
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
