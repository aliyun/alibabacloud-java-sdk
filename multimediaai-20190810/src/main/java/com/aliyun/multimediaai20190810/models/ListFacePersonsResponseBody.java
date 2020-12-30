// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFacePersonsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("FacePersons")
    public java.util.List<ListFacePersonsResponseBodyFacePersons> facePersons;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListFacePersonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFacePersonsResponseBody self = new ListFacePersonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFacePersonsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListFacePersonsResponseBody setFacePersons(java.util.List<ListFacePersonsResponseBodyFacePersons> facePersons) {
        this.facePersons = facePersons;
        return this;
    }
    public java.util.List<ListFacePersonsResponseBodyFacePersons> getFacePersons() {
        return this.facePersons;
    }

    public ListFacePersonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFacePersonsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFacePersonsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListFacePersonsResponseBodyFacePersons extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("ImageCount")
        public Long imageCount;

        @NameInMap("FacePersonId")
        public Long facePersonId;

        @NameInMap("FacePersonName")
        public String facePersonName;

        public static ListFacePersonsResponseBodyFacePersons build(java.util.Map<String, ?> map) throws Exception {
            ListFacePersonsResponseBodyFacePersons self = new ListFacePersonsResponseBodyFacePersons();
            return TeaModel.build(map, self);
        }

        public ListFacePersonsResponseBodyFacePersons setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListFacePersonsResponseBodyFacePersons setImageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Long getImageCount() {
            return this.imageCount;
        }

        public ListFacePersonsResponseBodyFacePersons setFacePersonId(Long facePersonId) {
            this.facePersonId = facePersonId;
            return this;
        }
        public Long getFacePersonId() {
            return this.facePersonId;
        }

        public ListFacePersonsResponseBodyFacePersons setFacePersonName(String facePersonName) {
            this.facePersonName = facePersonName;
            return this;
        }
        public String getFacePersonName() {
            return this.facePersonName;
        }

    }

}
