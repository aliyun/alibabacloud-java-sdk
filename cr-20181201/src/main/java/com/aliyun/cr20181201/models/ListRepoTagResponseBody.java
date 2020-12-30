// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Images")
    public java.util.List<ListRepoTagResponseBodyImages> images;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Code")
    public String code;

    public static ListRepoTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagResponseBody self = new ListRepoTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTagResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTagResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListRepoTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTagResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoTagResponseBody setImages(java.util.List<ListRepoTagResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListRepoTagResponseBodyImages> getImages() {
        return this.images;
    }

    public ListRepoTagResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRepoTagResponseBodyImages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ImageSize")
        public Long imageSize;

        @NameInMap("ImageCreate")
        public String imageCreate;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("ImageUpdate")
        public String imageUpdate;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("ImageId")
        public String imageId;

        public static ListRepoTagResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTagResponseBodyImages self = new ListRepoTagResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListRepoTagResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRepoTagResponseBodyImages setImageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Long getImageSize() {
            return this.imageSize;
        }

        public ListRepoTagResponseBodyImages setImageCreate(String imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public String getImageCreate() {
            return this.imageCreate;
        }

        public ListRepoTagResponseBodyImages setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListRepoTagResponseBodyImages setImageUpdate(String imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public String getImageUpdate() {
            return this.imageUpdate;
        }

        public ListRepoTagResponseBodyImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListRepoTagResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

}
