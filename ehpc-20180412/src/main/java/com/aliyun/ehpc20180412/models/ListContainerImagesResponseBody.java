// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponseBody extends TeaModel {
    /**
     * <p>The information of the database.</p>
     */
    @NameInMap("DBInfo")
    public String DBInfo;

    /**
     * <p>The array of images.</p>
     */
    @NameInMap("Images")
    public ListContainerImagesResponseBodyImages images;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListContainerImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerImagesResponseBody self = new ListContainerImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerImagesResponseBody setDBInfo(String DBInfo) {
        this.DBInfo = DBInfo;
        return this;
    }
    public String getDBInfo() {
        return this.DBInfo;
    }

    public ListContainerImagesResponseBody setImages(ListContainerImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public ListContainerImagesResponseBodyImages getImages() {
        return this.images;
    }

    public ListContainerImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListContainerImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContainerImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListContainerImagesResponseBodyImagesImages extends TeaModel {
        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the certificate application repository.</p>
         */
        @NameInMap("Repository")
        public String repository;

        /**
         * <p>The state of the image.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The container system of the image.</p>
         */
        @NameInMap("System")
        public String system;

        /**
         * <p>The tags of the image.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The type of the container. Set the value to singularity.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the image was updated.</p>
         */
        @NameInMap("UpdateDateTime")
        public String updateDateTime;

        public static ListContainerImagesResponseBodyImagesImages build(java.util.Map<String, ?> map) throws Exception {
            ListContainerImagesResponseBodyImagesImages self = new ListContainerImagesResponseBodyImagesImages();
            return TeaModel.build(map, self);
        }

        public ListContainerImagesResponseBodyImagesImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListContainerImagesResponseBodyImagesImages setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListContainerImagesResponseBodyImagesImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContainerImagesResponseBodyImagesImages setSystem(String system) {
            this.system = system;
            return this;
        }
        public String getSystem() {
            return this.system;
        }

        public ListContainerImagesResponseBodyImagesImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListContainerImagesResponseBodyImagesImages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContainerImagesResponseBodyImagesImages setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class ListContainerImagesResponseBodyImages extends TeaModel {
        @NameInMap("Images")
        public java.util.List<ListContainerImagesResponseBodyImagesImages> images;

        public static ListContainerImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListContainerImagesResponseBodyImages self = new ListContainerImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListContainerImagesResponseBodyImages setImages(java.util.List<ListContainerImagesResponseBodyImagesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ListContainerImagesResponseBodyImagesImages> getImages() {
            return this.images;
        }

    }

}
