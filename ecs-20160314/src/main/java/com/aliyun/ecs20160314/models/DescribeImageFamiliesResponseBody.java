// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageFamiliesResponseBody extends TeaModel {
    @NameInMap("ImageFamilies")
    public ImageFamilies imageFamilies;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageFamiliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFamiliesResponseBody self = new DescribeImageFamiliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFamiliesResponseBody setImageFamilies(ImageFamilies imageFamilies) {
        this.imageFamilies = imageFamilies;
        return this;
    }
    public ImageFamilies getImageFamilies() {
        return this.imageFamilies;
    }

    public DescribeImageFamiliesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImageFamiliesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageFamiliesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageFamiliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageFamiliesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ImageFamilies extends TeaModel {
        @NameInMap("ImageFamily")
        public java.util.List<String> imageFamily;

        public static ImageFamilies build(java.util.Map<String, ?> map) throws Exception {
            ImageFamilies self = new ImageFamilies();
            return TeaModel.build(map, self);
        }

        public ImageFamilies setImageFamily(java.util.List<String> imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public java.util.List<String> getImageFamily() {
            return this.imageFamily;
        }

    }

}
