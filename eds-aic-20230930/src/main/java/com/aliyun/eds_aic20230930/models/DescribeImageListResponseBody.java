// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeImageListResponseBody extends TeaModel {
    /**
     * <p>The images.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeImageListResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>620740FF-492F-5956-B1BA-361E966C0269</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListResponseBody self = new DescribeImageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageListResponseBody setData(java.util.List<DescribeImageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeImageListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeImageListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageListResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>117819727354****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the image was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-01 10:56:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The region where the image is distributed. The key is the region and the value is the distribution information.</p>
         */
        @NameInMap("ImageRegionDistributeMap")
        public java.util.Map<String, DataImageRegionDistributeMapValue> imageRegionDistributeMap;

        /**
         * <p>The list of regions.</p>
         */
        @NameInMap("ImageRegionList")
        public java.util.List<String> imageRegionList;

        /**
         * <p>The type of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>User: custom images.</li>
         * <li>System: system images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The language of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The time when the image was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25 10:06:45</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The rendering type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>GPURemote</li>
         * <li>CPU</li>
         * <li>GPULocal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("RenderingType")
        public String renderingType;

        /**
         * <p>The state of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE: The image is available.</li>
         * <li>DELETE: The image is deleted.</li>
         * <li>INIT: The image is being initialized.</li>
         * <li>CREATE_FAILED: The image failed to be created.</li>
         * <li>CREATING: The image is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The OS type of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Android 12</p>
         */
        @NameInMap("SystemType")
        public String systemType;

        public static DescribeImageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListResponseBodyData self = new DescribeImageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageListResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeImageListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageListResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeImageListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeImageListResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageListResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageListResponseBodyData setImageRegionDistributeMap(java.util.Map<String, DataImageRegionDistributeMapValue> imageRegionDistributeMap) {
            this.imageRegionDistributeMap = imageRegionDistributeMap;
            return this;
        }
        public java.util.Map<String, DataImageRegionDistributeMapValue> getImageRegionDistributeMap() {
            return this.imageRegionDistributeMap;
        }

        public DescribeImageListResponseBodyData setImageRegionList(java.util.List<String> imageRegionList) {
            this.imageRegionList = imageRegionList;
            return this;
        }
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        public DescribeImageListResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeImageListResponseBodyData setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeImageListResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeImageListResponseBodyData setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeImageListResponseBodyData setRenderingType(String renderingType) {
            this.renderingType = renderingType;
            return this;
        }
        public String getRenderingType() {
            return this.renderingType;
        }

        public DescribeImageListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageListResponseBodyData setSystemType(String systemType) {
            this.systemType = systemType;
            return this;
        }
        public String getSystemType() {
            return this.systemType;
        }

    }

}
