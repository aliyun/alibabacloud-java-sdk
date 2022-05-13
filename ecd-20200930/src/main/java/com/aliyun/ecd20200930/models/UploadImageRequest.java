// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("Description")
    public String description;

    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("OssObjectPath")
    public String ossObjectPath;

    @NameInMap("ProtocolType")
    public String protocolType;

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
