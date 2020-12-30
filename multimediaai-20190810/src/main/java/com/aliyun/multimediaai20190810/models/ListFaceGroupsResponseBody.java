// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFaceGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FaceGroups")
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups;

    public static ListFaceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsResponseBody self = new ListFaceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListFaceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFaceGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFaceGroupsResponseBody setFaceGroups(java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups) {
        this.faceGroups = faceGroups;
        return this;
    }
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> getFaceGroups() {
        return this.faceGroups;
    }

    public static class ListFaceGroupsResponseBodyFaceGroupsTemplates extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListFaceGroupsResponseBodyFaceGroupsTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroupsTemplates self = new ListFaceGroupsResponseBodyFaceGroupsTemplates();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroupsTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFaceGroupsResponseBodyFaceGroupsTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFaceGroupsResponseBodyFaceGroups extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FaceGroupName")
        public String faceGroupName;

        @NameInMap("PersonCount")
        public Long personCount;

        @NameInMap("ImageCount")
        public Long imageCount;

        @NameInMap("FaceGroupId")
        public Long faceGroupId;

        @NameInMap("Templates")
        public java.util.List<ListFaceGroupsResponseBodyFaceGroupsTemplates> templates;

        public static ListFaceGroupsResponseBodyFaceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroups self = new ListFaceGroupsResponseBodyFaceGroups();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFaceGroupsResponseBodyFaceGroups setFaceGroupName(String faceGroupName) {
            this.faceGroupName = faceGroupName;
            return this;
        }
        public String getFaceGroupName() {
            return this.faceGroupName;
        }

        public ListFaceGroupsResponseBodyFaceGroups setPersonCount(Long personCount) {
            this.personCount = personCount;
            return this;
        }
        public Long getPersonCount() {
            return this.personCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setImageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Long getImageCount() {
            return this.imageCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setFaceGroupId(Long faceGroupId) {
            this.faceGroupId = faceGroupId;
            return this;
        }
        public Long getFaceGroupId() {
            return this.faceGroupId;
        }

        public ListFaceGroupsResponseBodyFaceGroups setTemplates(java.util.List<ListFaceGroupsResponseBodyFaceGroupsTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListFaceGroupsResponseBodyFaceGroupsTemplates> getTemplates() {
            return this.templates;
        }

    }

}
