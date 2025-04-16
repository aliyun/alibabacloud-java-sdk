// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>Image details</p>
     */
    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    /**
     * <p>NextToken for the next page, include this value when requesting the next page</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0FC4A1C7-421C-5EAB-9361-4C0338EFA287</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        /**
         * <p>Architecture</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba cloud linux 3 full for H800</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Image ID</p>
         * 
         * <strong>example:</strong>
         * <p>i190951671671438639388</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Image name</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.9_x86_64_FULL_20221110</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Image version</p>
         * 
         * <strong>example:</strong>
         * <p>7.9</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>node count</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <p>Platform</p>
         * 
         * <strong>example:</strong>
         * <p>ALinux3</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>File MD5</p>
         * 
         * <strong>example:</strong>
         * <p>40741292480fc6d778138adcf8c</p>
         */
        @NameInMap("ReleaseFileMd5")
        public String releaseFileMd5;

        /**
         * <p>Image size</p>
         * 
         * <strong>example:</strong>
         * <p>5.8G</p>
         */
        @NameInMap("ReleaseFileSize")
        public String releaseFileSize;

        /**
         * <p>image type</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListImagesResponseBodyImages setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public ListImagesResponseBodyImages setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListImagesResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListImagesResponseBodyImages setReleaseFileMd5(String releaseFileMd5) {
            this.releaseFileMd5 = releaseFileMd5;
            return this;
        }
        public String getReleaseFileMd5() {
            return this.releaseFileMd5;
        }

        public ListImagesResponseBodyImages setReleaseFileSize(String releaseFileSize) {
            this.releaseFileSize = releaseFileSize;
            return this;
        }
        public String getReleaseFileSize() {
            return this.releaseFileSize;
        }

        public ListImagesResponseBodyImages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
