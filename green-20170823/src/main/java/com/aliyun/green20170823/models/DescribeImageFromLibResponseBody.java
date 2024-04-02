// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageFromLibResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ImageFromLibList")
    public java.util.List<DescribeImageFromLibResponseBodyImageFromLibList> imageFromLibList;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageFromLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromLibResponseBody self = new DescribeImageFromLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromLibResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageFromLibResponseBody setImageFromLibList(java.util.List<DescribeImageFromLibResponseBodyImageFromLibList> imageFromLibList) {
        this.imageFromLibList = imageFromLibList;
        return this;
    }
    public java.util.List<DescribeImageFromLibResponseBodyImageFromLibList> getImageFromLibList() {
        return this.imageFromLibList;
    }

    public DescribeImageFromLibResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageFromLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageFromLibResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageFromLibResponseBodyImageFromLibList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImageHitCount")
        public Long imageHitCount;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("VideoHitCount")
        public Long videoHitCount;

        public static DescribeImageFromLibResponseBodyImageFromLibList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFromLibResponseBodyImageFromLibList self = new DescribeImageFromLibResponseBodyImageFromLibList();
            return TeaModel.build(map, self);
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setImageHitCount(Long imageHitCount) {
            this.imageHitCount = imageHitCount;
            return this;
        }
        public Long getImageHitCount() {
            return this.imageHitCount;
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeImageFromLibResponseBodyImageFromLibList setVideoHitCount(Long videoHitCount) {
            this.videoHitCount = videoHitCount;
            return this;
        }
        public Long getVideoHitCount() {
            return this.videoHitCount;
        }

    }

}
