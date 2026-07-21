// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The data cloud disk size. Valid values: 80 to 500. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable security check.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSecurityCheck")
    public Boolean enableSecurityCheck;

    /**
     * <p>Specifies whether the image is a GPU image.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The type of the pre-installed GPU driver.</p>
     * 
     * <strong>example:</strong>
     * <p>gpu_grid9</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    /**
     * <p>The image name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Win10_Test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type used to activate the operating system after the image is imported. Valid values:</p>
     * <ul>
     * <li>Auto: Alibaba Cloud detects the source operating system and assigns a license. In automatic mode, the system first checks whether an Alibaba Cloud official license is available for the <code>Platform</code> you specified and assigns it to the imported image. If no such license is available, the system switches to BYOL (Bring Your Own License) mode.</li>
     * <li>Aliyun: Uses an Alibaba Cloud official license based on the <code>Platform</code> you specified.</li>
     * <li>BYOL: Uses the license that comes with the source operating system. When you use BYOL, make sure that your license key supports use on Alibaba Cloud.</li>
     * </ul>
     * <p>Default value: Auto.</p>
     * <blockquote>
     * <p>Systems such as Windows 10 cannot be activated through Alibaba Cloud. Set <code>LicenseType</code> to BYOL for custom activation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The OSS object path of the image file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ossbucket:endpoint/object">https://ossbucket:endpoint/object</a></p>
     */
    @NameInMap("OssObjectPath")
    public String ossObjectPath;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The system cloud disk size. Unit: GiB.</p>
     * <blockquote>
     * <p>The system cloud disk size cannot be smaller than the image file size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public String systemDiskSize;

    public static UploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadImageRequest self = new UploadImageRequest();
        return TeaModel.build(map, self);
    }

    public UploadImageRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public UploadImageRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public UploadImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadImageRequest setEnableSecurityCheck(Boolean enableSecurityCheck) {
        this.enableSecurityCheck = enableSecurityCheck;
        return this;
    }
    public Boolean getEnableSecurityCheck() {
        return this.enableSecurityCheck;
    }

    public UploadImageRequest setGpuCategory(Boolean gpuCategory) {
        this.gpuCategory = gpuCategory;
        return this;
    }
    public Boolean getGpuCategory() {
        return this.gpuCategory;
    }

    public UploadImageRequest setGpuDriverType(String gpuDriverType) {
        this.gpuDriverType = gpuDriverType;
        return this;
    }
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    public UploadImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UploadImageRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public UploadImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public UploadImageRequest setOssObjectPath(String ossObjectPath) {
        this.ossObjectPath = ossObjectPath;
        return this;
    }
    public String getOssObjectPath() {
        return this.ossObjectPath;
    }

    public UploadImageRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UploadImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadImageRequest setSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public String getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
