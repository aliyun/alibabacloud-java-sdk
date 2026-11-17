// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <p>The business region ID, such as cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The business line to which the image belongs. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The image boot mode. Valid values:</p>
     * <ul>
     * <li>BIOS: Legacy BIOS boot.</li>
     * <li>UEFI: UEFI boot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UEFI</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom Cloud Desktop image</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the image security check. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     */
    @NameInMap("EnableSecurityCheck")
    public Boolean enableSecurityCheck;

    /**
     * <p>Specifies whether the image is a GPU image. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The GPU driver type. Valid values:</p>
     * <ul>
     * <li>gpu_grid9: GRID 9 driver.</li>
     * <li>gpu_grid12: GRID 12 driver.</li>
     * <li>gpu_custom: Custom driver.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gpu_grid12</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    /**
     * <p>The name of the image after it is imported. This parameter cannot be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoImage</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The operating system license type. Valid values:</p>
     * <ul>
     * <li>Auto: Automatically selected.</li>
     * <li>Aliyun: Provided by Alibaba Cloud.</li>
     * <li>BYOL: Bring your own license.
     * Default value: Auto.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The operating system type of the image file. It must be consistent with the actual operating system of the image, such as Windows or Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The complete OSS object URL of the image file to be imported, including the bucket domain name and file path. The file must be uploaded before you call this operation. Example: <a href="https://BucketName.oss-cn-hangzhou.aliyuncs.com/FilePath">https://BucketName.oss-cn-hangzhou.aliyuncs.com/FilePath</a>.</p>
     */
    @NameInMap("OssObjectPath")
    public String ossObjectPath;

    /**
     * <p>The product type. Currently, only CloudDesktop (Cloud Desktop) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The image connection protocol. Valid values: ASP and HDX. Default value: ASP.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The size of the system cloud disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
    }

    public ImportImageRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ImportImageRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ImportImageRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ImportImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportImageRequest setEnableSecurityCheck(Boolean enableSecurityCheck) {
        this.enableSecurityCheck = enableSecurityCheck;
        return this;
    }
    public Boolean getEnableSecurityCheck() {
        return this.enableSecurityCheck;
    }

    public ImportImageRequest setGpuCategory(Boolean gpuCategory) {
        this.gpuCategory = gpuCategory;
        return this;
    }
    public Boolean getGpuCategory() {
        return this.gpuCategory;
    }

    public ImportImageRequest setGpuDriverType(String gpuDriverType) {
        this.gpuDriverType = gpuDriverType;
        return this;
    }
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    public ImportImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ImportImageRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ImportImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ImportImageRequest setOssObjectPath(String ossObjectPath) {
        this.ossObjectPath = ossObjectPath;
        return this;
    }
    public String getOssObjectPath() {
        return this.ossObjectPath;
    }

    public ImportImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ImportImageRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public ImportImageRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
