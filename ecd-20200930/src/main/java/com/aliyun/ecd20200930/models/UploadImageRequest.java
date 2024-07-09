// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    /**
     * <p>The size of the data disk. Valid values: 80 to 500. Unit: GiB.</p>
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
     * <p>Specifies whether the image is a GPU-accelerated image.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The type of the pre-installed GPU driver.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>gpu_grid9: This GPU driver is used on cloud computers of the following two specifications: graphics – 4 vCPUs, 23 GiB memory, 4 GiB GPU memory, and graphics – 10 vCPUs, 46 GiB memory, 8 GiB GPU memory.</li>
     * <li>gpu_custom: You can install the driver later.</li>
     * <li>gpu_grid12: This GPU driver is used on graphical cloud computers of specifications other than the following two specifications: graphics – 4 vCPUs, 23 GiB memory, &amp; 4 GiB GPU memory, and graphics – 10 vCPUs, 46 GiB memory, &amp; 8 GiB GPU memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gpu_grid9</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Win10_Test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The type of the license that is used to activate the operating system after the image is imported. Valid values:</p>
     * <ul>
     * <li>Auto: Elastic Desktop Service detects the operating system of the image and allocates a license to the operating system. In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is specified in the <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is specified, the system allocates the license to the imported image. If no such license is specified, the BYOL (Bring Your Own License) mode is used.</li>
     * <li>Aliyun: The license that is allocated by an official Alibaba Cloud channel and is specified by <code>Platform</code> is used for the operating system distribution.</li>
     * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL mode, make sure that your license key is supported by Alibaba Cloud.</li>
     * </ul>
     * <p>Default value: Auto.</p>
     * <blockquote>
     * <p> Windows 10 cannot be activated by Alibaba Cloud. Set the <code>LicenseType</code> to BYOL for Windows 10.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The type of the operating system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Linux</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Windows</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The object path of the image file in Object Storage Service (OSS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ossbucket:endpoint/object">https://ossbucket:endpoint/object</a></p>
     */
    @NameInMap("OssObjectPath")
    public String ossObjectPath;

    /**
     * <p>The protocol type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASP: in-house Adaptive Streaming Protocol (ASP)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadImageRequest self = new UploadImageRequest();
        return TeaModel.build(map, self);
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

}
