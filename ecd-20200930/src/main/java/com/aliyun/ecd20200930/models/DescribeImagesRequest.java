// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The instance type of the cloud computer. You can call the <a href="https://help.aliyun.com/document_detail/436816.html">DescribeDesktopTypes</a> operation to obtain the parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics.xlarge</p>
     */
    @NameInMap("DesktopInstanceType")
    public String desktopInstanceType;

    /**
     * <p>The image version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.3-R-20220616.133609</p>
     */
    @NameInMap("FotaVersion")
    public String fotaVersion;

    /**
     * <p>Specifies whether the images are GPU-accelerated images.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GpuCategory")
    public Boolean gpuCategory;

    /**
     * <p>The version of the GPU driver.</p>
     * 
     * <strong>example:</strong>
     * <p>417.22</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The IDs of the images. You can specify one or more image IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Win_01</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The state of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("ImageStatus")
    public String imageStatus;

    /**
     * <p>The type of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The language of the OS.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("LanguageType")
    public String languageType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If you do not specify this parameter, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the operating system of the images. Default value: <code>null</code>.</p>
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
     * <p>The protocol type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HDX: High-definition Experience (HDX) protocol</li>
     * <li>ASP: in-house Adaptive Streaming Protocol (ASP) (recommended)</li>
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

    /**
     * <p>The session type.</p>
     * 
     * <strong>example:</strong>
     * <p>SINGLE_SESSION</p>
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
