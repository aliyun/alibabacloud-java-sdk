// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The cloud desktop type. You can call the [DescribeBundles](~~188884~~) operation to query the available cloud desktop types.</p>
     */
    @NameInMap("DesktopInstanceType")
    public String desktopInstanceType;

    /**
     * <p>The image version.</p>
     */
    @NameInMap("FotaVersion")
    public String fotaVersion;

    /**
     * <p>Specifies whether the image is a GPU-accelerated image.</p>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The version of the GPU driver.</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The IDs of the images. You can specify one or more image IDs.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The image name.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The state of the image.</p>
     */
    @NameInMap("ImageStatus")
    public String imageStatus;

    /**
     * <p>The type of the image.</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The language of the OS.</p>
     */
    @NameInMap("LanguageType")
    public String languageType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If you do not specify this parameter, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the OS. Default value: `null`.</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The type of the protocol.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session type.</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

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

    public DescribeImagesRequest setFotaVersion(String fotaVersion) {
        this.fotaVersion = fotaVersion;
        return this;
    }
    public String getFotaVersion() {
        return this.fotaVersion;
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

    public DescribeImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
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

    public DescribeImagesRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
    }

}
