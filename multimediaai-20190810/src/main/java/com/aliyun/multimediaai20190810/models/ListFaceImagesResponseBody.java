// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFaceImagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FaceImages")
    public java.util.List<ListFaceImagesResponseBodyFaceImages> faceImages;

    public static ListFaceImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceImagesResponseBody self = new ListFaceImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListFaceImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFaceImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFaceImagesResponseBody setFaceImages(java.util.List<ListFaceImagesResponseBodyFaceImages> faceImages) {
        this.faceImages = faceImages;
        return this;
    }
    public java.util.List<ListFaceImagesResponseBodyFaceImages> getFaceImages() {
        return this.faceImages;
    }

    public static class ListFaceImagesResponseBodyFaceImages extends TeaModel {
        @NameInMap("FaceRectangle")
        public java.util.List<Float> faceRectangle;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("FaceImageId")
        public Long faceImageId;

        public static ListFaceImagesResponseBodyFaceImages build(java.util.Map<String, ?> map) throws Exception {
            ListFaceImagesResponseBodyFaceImages self = new ListFaceImagesResponseBodyFaceImages();
            return TeaModel.build(map, self);
        }

        public ListFaceImagesResponseBodyFaceImages setFaceRectangle(java.util.List<Float> faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public java.util.List<Float> getFaceRectangle() {
            return this.faceRectangle;
        }

        public ListFaceImagesResponseBodyFaceImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListFaceImagesResponseBodyFaceImages setFaceImageId(Long faceImageId) {
            this.faceImageId = faceImageId;
            return this;
        }
        public Long getFaceImageId() {
            return this.faceImageId;
        }

    }

}
