// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CourseLesson")
    public DescribeCourseLessonResponseBodyCourseLesson courseLesson;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCourseLessonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseLessonResponseBody self = new DescribeCourseLessonResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCourseLessonResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCourseLessonResponseBody setCourseLesson(DescribeCourseLessonResponseBodyCourseLesson courseLesson) {
        this.courseLesson = courseLesson;
        return this;
    }
    public DescribeCourseLessonResponseBodyCourseLesson getCourseLesson() {
        return this.courseLesson;
    }

    public DescribeCourseLessonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCourseLessonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCourseLessonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCourseLessonResponseBodyCourseLesson extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Url")
        public String url;

        public static DescribeCourseLessonResponseBodyCourseLesson build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseLessonResponseBodyCourseLesson self = new DescribeCourseLessonResponseBodyCourseLesson();
            return TeaModel.build(map, self);
        }

        public DescribeCourseLessonResponseBodyCourseLesson setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCourseLessonResponseBodyCourseLesson setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
