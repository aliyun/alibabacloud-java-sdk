// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class ListCoursesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Courses")
    public java.util.List<ListCoursesResponseBodyCourses> courses;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCoursesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCoursesResponseBody self = new ListCoursesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCoursesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCoursesResponseBody setCourses(java.util.List<ListCoursesResponseBodyCourses> courses) {
        this.courses = courses;
        return this;
    }
    public java.util.List<ListCoursesResponseBodyCourses> getCourses() {
        return this.courses;
    }

    public ListCoursesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCoursesResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCoursesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
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

    public ListCoursesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCoursesResponseBodyCourses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Id")
        public String id;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("LessonNum")
        public Integer lessonNum;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Title")
        public String title;

        public static ListCoursesResponseBodyCourses build(java.util.Map<String, ?> map) throws Exception {
            ListCoursesResponseBodyCourses self = new ListCoursesResponseBodyCourses();
            return TeaModel.build(map, self);
        }

        public ListCoursesResponseBodyCourses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListCoursesResponseBodyCourses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCoursesResponseBodyCourses setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public ListCoursesResponseBodyCourses setLessonNum(Integer lessonNum) {
            this.lessonNum = lessonNum;
            return this;
        }
        public Integer getLessonNum() {
            return this.lessonNum;
        }

        public ListCoursesResponseBodyCourses setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public ListCoursesResponseBodyCourses setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListCoursesResponseBodyCourses setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
