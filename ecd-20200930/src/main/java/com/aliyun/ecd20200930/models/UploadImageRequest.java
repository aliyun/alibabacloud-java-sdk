// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    /**
     * <p>The size of the data disk. Valid values: 80 to 500. Unit: GiB.</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable security check.</p>
     */
    @NameInMap("EnableSecurityCheck")
    public Boolean enableSecurityCheck;

    /**
     * <p>Specifies whether the image is a GPU-accelerated image.</p>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The type of the pre-installed GPU driver. Valid values:</p>
     * <br>
     * <p>*   gpu_grid9: This value is applicable to a Graphics cloud desktop that uses 4 vCores, 23 GB memory, and 4 GB GPU memory and a Graphics cloud desktop that uses 10 vCores, 46 GB memory, and 8 GB GPU memory</p>
     * <p>*   gpu_grid12: This value is applicable to a cloud desktop other than a Graphics cloud desktop that uses 4 vCores, 23 GB memory, and 4 GB GPU memory and a Graphics cloud desktop that uses 10 vCores, 46 GB memory, and 8 GB GPU memory.</p>
     * <p>*   gpu_custom: You can install a driver later.</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The type of the license that you want to use to activate the OS after the image is imported. Valid values:</p>
     * <br>
     * <p>*   Auto: Elastic Desktop Service (EDS) checks the source OS of the image and allocates a license to the OS. EDS first checks whether the OS distribution that is specified by `Platform` has a license allocated by using an official Alibaba Cloud channel. If yes, the allocated license is used. If no, the license of the source OS is used.</p>
     * <p>*   Aliyun: The license allocated by using an official Alibaba Cloud channel is used for the OS distribution that is specified by `Platform`.</p>
     * <p>*   BYOL: The license of the source OS is used. In this case, make sure that your license key can be used in Alibaba Cloud.</p>
     * <br>
     * <p>Default value: Auto.</p>
     * <br>
     * <p>> Windows 10 cannot be activated by using a license that is allocated by using an official Alibaba Cloud channel. In this case, you must set `LicenseType` to BYOL.</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The type of the OS. Valid values:</p>
     * <br>
     * <p>*   Windows</p>
     * <p>*   Linux</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The URL of the image object that you want to upload in Object Storage Service (OSS).</p>
     */
    @NameInMap("OssObjectPath")
    public String ossObjectPath;

    /**
     * <p>The type of the protocol. Valid value: ASP.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the region.</p>
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
