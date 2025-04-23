// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeEstackImageResponseBody extends TeaModel {
    /**
     * <p>The array of base images.</p>
     */
    @NameInMap("ImageList")
    public DescribeEstackImageResponseBodyImageList imageList;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEstackImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEstackImageResponseBody self = new DescribeEstackImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEstackImageResponseBody setImageList(DescribeEstackImageResponseBodyImageList imageList) {
        this.imageList = imageList;
        return this;
    }
    public DescribeEstackImageResponseBodyImageList getImageList() {
        return this.imageList;
    }

    public DescribeEstackImageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEstackImageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEstackImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEstackImageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEstackImageResponseBodyImageListImageListInfo extends TeaModel {
        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorflow-21.09-tf1-py3.sif</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The size of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>65535 GiB</p>
         */
        @NameInMap("ImageSize")
        public Integer imageSize;

        /**
         * <p>The type of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>singularity</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The download URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.oss-cn-hangzhou.aliyuncs.com/eStackPackage/singularity/tensorflow-21.09-tf1-py3.sif">http://xxxx.oss-cn-hangzhou.aliyuncs.com/eStackPackage/singularity/tensorflow-21.09-tf1-py3.sif</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The time when the image was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-05T07:10:55.000Z</p>
         */
        @NameInMap("RecentUpdateTime")
        public String recentUpdateTime;

        public static DescribeEstackImageResponseBodyImageListImageListInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEstackImageResponseBodyImageListImageListInfo self = new DescribeEstackImageResponseBodyImageListImageListInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEstackImageResponseBodyImageListImageListInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeEstackImageResponseBodyImageListImageListInfo setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

        public DescribeEstackImageResponseBodyImageListImageListInfo setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeEstackImageResponseBodyImageListImageListInfo setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeEstackImageResponseBodyImageListImageListInfo setRecentUpdateTime(String recentUpdateTime) {
            this.recentUpdateTime = recentUpdateTime;
            return this;
        }
        public String getRecentUpdateTime() {
            return this.recentUpdateTime;
        }

    }

    public static class DescribeEstackImageResponseBodyImageList extends TeaModel {
        @NameInMap("ImageListInfo")
        public java.util.List<DescribeEstackImageResponseBodyImageListImageListInfo> imageListInfo;

        public static DescribeEstackImageResponseBodyImageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEstackImageResponseBodyImageList self = new DescribeEstackImageResponseBodyImageList();
            return TeaModel.build(map, self);
        }

        public DescribeEstackImageResponseBodyImageList setImageListInfo(java.util.List<DescribeEstackImageResponseBodyImageListImageListInfo> imageListInfo) {
            this.imageListInfo = imageListInfo;
            return this;
        }
        public java.util.List<DescribeEstackImageResponseBodyImageListImageListInfo> getImageListInfo() {
            return this.imageListInfo;
        }

    }

}
