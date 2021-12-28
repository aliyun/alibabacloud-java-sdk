// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    @NameInMap("DesktopInstanceType")
    public String desktopInstanceType;

    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    @NameInMap("ImageStatus")
    public String imageStatus;

    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("LanguageType")
    public String languageType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("ProtocolType")
    public String protocolType;

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
