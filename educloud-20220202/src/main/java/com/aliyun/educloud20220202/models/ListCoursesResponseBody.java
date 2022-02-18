// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListCoursesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListCoursesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCoursesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCoursesResponseBody self = new ListCoursesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCoursesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCoursesResponseBody setData(ListCoursesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCoursesResponseBodyData getData() {
        return this.data;
    }

    public ListCoursesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCoursesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCoursesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCoursesResponseBodyDataList extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CourseId")
        public String courseId;

        @NameInMap("Introduce")
        public String introduce;

        @NameInMap("LessonNum")
        public Long lessonNum;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Title")
        public String title;

        public static ListCoursesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCoursesResponseBodyDataList self = new ListCoursesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCoursesResponseBodyDataList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListCoursesResponseBodyDataList setCourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }
        public String getCourseId() {
            return this.courseId;
        }

        public ListCoursesResponseBodyDataList setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public ListCoursesResponseBodyDataList setLessonNum(Long lessonNum) {
            this.lessonNum = lessonNum;
            return this;
        }
        public Long getLessonNum() {
            return this.lessonNum;
        }

        public ListCoursesResponseBodyDataList setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public ListCoursesResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListCoursesResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListCoursesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCoursesResponseBodyDataList> list;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListCoursesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCoursesResponseBodyData self = new ListCoursesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCoursesResponseBodyData setList(java.util.List<ListCoursesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCoursesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCoursesResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListCoursesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCoursesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
