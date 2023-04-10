// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    /**
     * <p>The details of the images.</p>
     */
    @NameInMap("Images")
    public java.util.List<DescribeImagesResponseBodyImages> images;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setImages(java.util.List<DescribeImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        /**
         * <p>The version of the image.</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The time when the image was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        /**
         * <p>The description of the image.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the image is a GPU-accelerated image.</p>
         */
        @NameInMap("GpuCategory")
        public Boolean gpuCategory;

        /**
         * <p>The version of the GPU driver.</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image.</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The OS type of the image.</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The OS type of the image.</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The progress of image creation. Unit: percentage (%).</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The session type of the image. Valid values:</p>
         * <br>
         * <p>*   SINGLE_SESSION: single-session images</p>
         * <p>*   MULTIPLE_SESSION: multi-session images</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The number of shared images.</p>
         */
        @NameInMap("SharedCount")
        public Integer sharedCount;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The state of the image.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The languages of the OS.</p>
         */
        @NameInMap("SupportedLanguages")
        public java.util.List<String> supportedLanguages;

        /**
         * <p>The time when the image was last modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain the list of KMS keys.</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImages setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseBodyImages setGpuCategory(Boolean gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Boolean getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeImagesResponseBodyImages setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagesResponseBodyImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeImagesResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseBodyImages setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImages setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeImagesResponseBodyImages setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeImagesResponseBodyImages setSharedCount(Integer sharedCount) {
            this.sharedCount = sharedCount;
            return this;
        }
        public Integer getSharedCount() {
            return this.sharedCount;
        }

        public DescribeImagesResponseBodyImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseBodyImages setSupportedLanguages(java.util.List<String> supportedLanguages) {
            this.supportedLanguages = supportedLanguages;
            return this;
        }
        public java.util.List<String> getSupportedLanguages() {
            return this.supportedLanguages;
        }

        public DescribeImagesResponseBodyImages setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeImagesResponseBodyImages setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeImagesResponseBodyImages setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
