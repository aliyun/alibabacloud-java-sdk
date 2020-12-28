// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("DBInfo")
    public String DBInfo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Images")
    public java.util.List<ListContainerImagesResponseBodyImages> images;

    public static ListContainerImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerImagesResponseBody self = new ListContainerImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListContainerImagesResponseBody setDBInfo(String DBInfo) {
        this.DBInfo = DBInfo;
        return this;
    }
    public String getDBInfo() {
        return this.DBInfo;
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

    public ListContainerImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListContainerImagesResponseBody setImages(java.util.List<ListContainerImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListContainerImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public static class ListContainerImagesResponseBodyImages extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateDateTime")
        public String updateDateTime;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("System")
        public String system;

        @NameInMap("ImageId")
        public String imageId;

        public static ListContainerImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListContainerImagesResponseBodyImages self = new ListContainerImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListContainerImagesResponseBodyImages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContainerImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContainerImagesResponseBodyImages setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

        public ListContainerImagesResponseBodyImages setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListContainerImagesResponseBodyImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListContainerImagesResponseBodyImages setSystem(String system) {
            this.system = system;
            return this;
        }
        public String getSystem() {
            return this.system;
        }

        public ListContainerImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

}
