// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Course")
    public DescribeCourseResponseBodyCourse course;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCourseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseResponseBody self = new DescribeCourseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCourseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCourseResponseBody setCourse(DescribeCourseResponseBodyCourse course) {
        this.course = course;
        return this;
    }
    public DescribeCourseResponseBodyCourse getCourse() {
        return this.course;
    }

    public DescribeCourseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCourseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCourseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCourseResponseBodyCourseChaptersLessons extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyCourseChaptersLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourseChaptersLessons self = new DescribeCourseResponseBodyCourseChaptersLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourseChaptersLessons setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyCourseChaptersLessons setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCourseResponseBodyCourseChaptersLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyCourseChaptersLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyCourseChaptersUnitLessons extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyCourseChaptersUnitLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourseChaptersUnitLessons self = new DescribeCourseResponseBodyCourseChaptersUnitLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourseChaptersUnitLessons setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyCourseChaptersUnitLessons setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCourseResponseBodyCourseChaptersUnitLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyCourseChaptersUnitLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyCourseChaptersUnit extends TeaModel {
        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyCourseChaptersUnitLessons> lessons;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Title")
        public String title;

        public static DescribeCourseResponseBodyCourseChaptersUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourseChaptersUnit self = new DescribeCourseResponseBodyCourseChaptersUnit();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourseChaptersUnit setLessons(java.util.List<DescribeCourseResponseBodyCourseChaptersUnitLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyCourseChaptersUnitLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyCourseChaptersUnit setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public DescribeCourseResponseBodyCourseChaptersUnit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeCourseResponseBodyCourseChapters extends TeaModel {
        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyCourseChaptersLessons> lessons;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Title")
        public String title;

        @NameInMap("Unit")
        public java.util.List<DescribeCourseResponseBodyCourseChaptersUnit> unit;

        public static DescribeCourseResponseBodyCourseChapters build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourseChapters self = new DescribeCourseResponseBodyCourseChapters();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourseChapters setLessons(java.util.List<DescribeCourseResponseBodyCourseChaptersLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyCourseChaptersLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyCourseChapters setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public DescribeCourseResponseBodyCourseChapters setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyCourseChapters setUnit(java.util.List<DescribeCourseResponseBodyCourseChaptersUnit> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyCourseChaptersUnit> getUnit() {
            return this.unit;
        }

    }

    public static class DescribeCourseResponseBodyCourseLessons extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyCourseLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourseLessons self = new DescribeCourseResponseBodyCourseLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourseLessons setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyCourseLessons setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCourseResponseBodyCourseLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyCourseLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyCourse extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Chapters")
        public java.util.List<DescribeCourseResponseBodyCourseChapters> chapters;

        @NameInMap("Id")
        public String id;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("LessonNum")
        public Integer lessonNum;

        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyCourseLessons> lessons;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Title")
        public String title;

        public static DescribeCourseResponseBodyCourse build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyCourse self = new DescribeCourseResponseBodyCourse();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyCourse setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCourseResponseBodyCourse setChapters(java.util.List<DescribeCourseResponseBodyCourseChapters> chapters) {
            this.chapters = chapters;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyCourseChapters> getChapters() {
            return this.chapters;
        }

        public DescribeCourseResponseBodyCourse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCourseResponseBodyCourse setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public DescribeCourseResponseBodyCourse setLessonNum(Integer lessonNum) {
            this.lessonNum = lessonNum;
            return this;
        }
        public Integer getLessonNum() {
            return this.lessonNum;
        }

        public DescribeCourseResponseBodyCourse setLessons(java.util.List<DescribeCourseResponseBodyCourseLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyCourseLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyCourse setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public DescribeCourseResponseBodyCourse setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeCourseResponseBodyCourse setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
