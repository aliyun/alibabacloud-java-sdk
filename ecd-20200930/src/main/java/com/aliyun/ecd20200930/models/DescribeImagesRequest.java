// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    // The type of the cloud desktop. You can call the [DescribeBundles](~~188884~~) operation to obtain the type of the cloud desktop.
    @NameInMap("DesktopInstanceType")
    public String desktopInstanceType;

    // Specifies whether the image is a GPU-accelerated image.
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    // The version of the GPU driver.
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    // The IDs of the images. You can specify one or more image IDs.
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    // The state of the image.
    @NameInMap("ImageStatus")
    public String imageStatus;

    // The type of the image.
    @NameInMap("ImageType")
    public String imageType;

    // The language of the OS.
    @NameInMap("LanguageType")
    public String languageType;

    // The number of entries to return on each page.
    // 
    // *   Maximum value: 100.
    // *   Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The type of the OS. Default value: `null`.
    @NameInMap("OsType")
    public String osType;

    // The type of the protocol. Recommended value: ASP.
    @NameInMap("ProtocolType")
    public String protocolType;

    // The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesRequest self = new DescribeImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagesRequest setDesktopInstanceType(String desktopInstanceType) {
        this.desktopInstanceType = desktopInstanceType;
        return this;
    }
    public String getDesktopInstanceType() {
        return this.desktopInstanceType;
    }

    public DescribeImagesRequest setGpuCategory(Boolean gpuCategory) {
        this.gpuCategory = gpuCategory;
        return this;
    }
    public Boolean getGpuCategory() {
        return this.gpuCategory;
    }

    public DescribeImagesRequest setGpuDriverVersion(String gpuDriverVersion) {
        this.gpuDriverVersion = gpuDriverVersion;
        return this;
    }
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    public DescribeImagesRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public DescribeImagesRequest setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }
    public String getImageStatus() {
        return this.imageStatus;
    }

    public DescribeImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeImagesRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }
    public String getLanguageType() {
        return this.languageType;
    }

    public DescribeImagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeImagesRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
